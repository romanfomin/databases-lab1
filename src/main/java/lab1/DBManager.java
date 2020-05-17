package lab1;

import lab1.model.*;
import lab1.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Component
public class DBManager {

    @Autowired
    ConferenceCrudRepository conferenceCrudRepository;

    @Autowired
    EditionCrudRepository editionCrudRepository;

    @Autowired
    EditionTypeCrudRepository editionTypeCrudRepository;

    @Autowired
    LanguageCrudRepository languageCrudRepository;

    @Autowired
    LibraryInfoCrudRepository libraryInfoCrudRepository;

    @Autowired
    ParticipantCrudRepository participantCrudRepository;

    @Autowired
    PositionCrudRepository positionCrudRepository;

    @Autowired
    PublicationCrudRepository publicationCrudRepository;

    public void doDbOperations() {
        saveData();
        getData();
    }

    @Transactional
    public void saveData() {
        Position position = new Position("bachelor");
        Language language = new Language("Russian");

        Participant participant1 = new Participant("name1", "lastname1", position);
        Participant participant2 = new Participant("name2", "lastname2", position);
        List<Participant> participants = new ArrayList<>();
        participants.add(participant1);
        participants.add(participant2);

        Conference conference = new Conference("conf1", "addr1", new Date(), participants);

        EditionType editionType = new EditionType("type1");

        Publication publication1 = new Publication("pub1", participants, new Date());
        Publication publication2 = new Publication("pub2", Collections.singletonList(participant1), new Date());

        Edition edition1 = new Edition("ed1", editionType, language,
                Arrays.asList(publication1, publication2));
        Edition edition2 = new Edition("ed2", editionType, language,
                Collections.singletonList(publication1));

        LibraryInfo libraryInfo1 = new LibraryInfo(edition1, participant1, new Date(), new Date());
        LibraryInfo libraryInfo2 = new LibraryInfo(edition2, participant1, new Date(), new Date());

        positionCrudRepository.save(position);
        languageCrudRepository.save(language);

        participantCrudRepository.save(participant1);
        participantCrudRepository.save(participant2);

        conferenceCrudRepository.save(conference);

        editionTypeCrudRepository.save(editionType);

        publicationCrudRepository.save(publication1);
        publicationCrudRepository.save(publication2);

        editionCrudRepository.save(edition1);
        editionCrudRepository.save(edition2);

        libraryInfoCrudRepository.save(libraryInfo1);
        libraryInfoCrudRepository.save(libraryInfo2);
    }

    @Transactional
    public void getData() {
        Iterable<Participant> participants = participantCrudRepository.findAll();
        Iterable<Conference> conferences = conferenceCrudRepository.findAll();
        Iterable<Edition> editions = editionCrudRepository.findAll();

        System.out.println("end");
    }
}
