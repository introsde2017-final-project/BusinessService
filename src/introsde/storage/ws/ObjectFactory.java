
package introsde.storage.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.storage.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetExerciseEntry_QNAME = new QName("http://ws.storage.introsde/", "getExerciseEntry");
    private final static QName _GetExercises_QNAME = new QName("http://ws.storage.introsde/", "getExercises");
    private final static QName _GetPersonByChatIdResponse_QNAME = new QName("http://ws.storage.introsde/", "getPersonByChatIdResponse");
    private final static QName _SaveTemplateResponse_QNAME = new QName("http://ws.storage.introsde/", "saveTemplateResponse");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://ws.storage.introsde/", "deletePersonResponse");
    private final static QName _UpdatePersonMeasureResponse_QNAME = new QName("http://ws.storage.introsde/", "updatePersonMeasureResponse");
    private final static QName _EditExerciseEntry_QNAME = new QName("http://ws.storage.introsde/", "editExerciseEntry");
    private final static QName _SetInfoResponse_QNAME = new QName("http://ws.storage.introsde/", "setInfoResponse");
    private final static QName _CommitDayResponse_QNAME = new QName("http://ws.storage.introsde/", "commitDayResponse");
    private final static QName _SearchFood_QNAME = new QName("http://ws.storage.introsde/", "searchFood");
    private final static QName _ReadMeasureTypesResponse_QNAME = new QName("http://ws.storage.introsde/", "readMeasureTypesResponse");
    private final static QName _CommitDay_QNAME = new QName("http://ws.storage.introsde/", "commitDay");
    private final static QName _ReadPersonMeasure_QNAME = new QName("http://ws.storage.introsde/", "readPersonMeasure");
    private final static QName _SetInfo_QNAME = new QName("http://ws.storage.introsde/", "setInfo");
    private final static QName _GetPeopleList_QNAME = new QName("http://ws.storage.introsde/", "getPeopleList");
    private final static QName _ReadPersonMeasureResponse_QNAME = new QName("http://ws.storage.introsde/", "readPersonMeasureResponse");
    private final static QName _GetExercisesResponse_QNAME = new QName("http://ws.storage.introsde/", "getExercisesResponse");
    private final static QName _GetFoodResponse_QNAME = new QName("http://ws.storage.introsde/", "getFoodResponse");
    private final static QName _UpdatePerson_QNAME = new QName("http://ws.storage.introsde/", "updatePerson");
    private final static QName _ReadPersonHistory_QNAME = new QName("http://ws.storage.introsde/", "readPersonHistory");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://ws.storage.introsde/", "readPersonResponse");
    private final static QName _SaveTemplate_QNAME = new QName("http://ws.storage.introsde/", "saveTemplate");
    private final static QName _ReadPersonHistoryResponse_QNAME = new QName("http://ws.storage.introsde/", "readPersonHistoryResponse");
    private final static QName _GetPersonByChatId_QNAME = new QName("http://ws.storage.introsde/", "getPersonByChatId");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://ws.storage.introsde/", "updatePersonResponse");
    private final static QName _ReadPerson_QNAME = new QName("http://ws.storage.introsde/", "readPerson");
    private final static QName _GetPeopleListResponse_QNAME = new QName("http://ws.storage.introsde/", "getPeopleListResponse");
    private final static QName _EditExerciseEntryResponse_QNAME = new QName("http://ws.storage.introsde/", "editExerciseEntryResponse");
    private final static QName _GetFood_QNAME = new QName("http://ws.storage.introsde/", "getFood");
    private final static QName _ReadMeasureTypes_QNAME = new QName("http://ws.storage.introsde/", "readMeasureTypes");
    private final static QName _CreatePerson_QNAME = new QName("http://ws.storage.introsde/", "createPerson");
    private final static QName _GetExerciseEntryResponse_QNAME = new QName("http://ws.storage.introsde/", "getExerciseEntryResponse");
    private final static QName _SearchFoodResponse_QNAME = new QName("http://ws.storage.introsde/", "searchFoodResponse");
    private final static QName _UpdatePersonMeasure_QNAME = new QName("http://ws.storage.introsde/", "updatePersonMeasure");
    private final static QName _DeletePerson_QNAME = new QName("http://ws.storage.introsde/", "deletePerson");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://ws.storage.introsde/", "createPersonResponse");
    private final static QName _SavePersonMeasure_QNAME = new QName("http://ws.storage.introsde/", "savePersonMeasure");
    private final static QName _SavePersonMeasureResponse_QNAME = new QName("http://ws.storage.introsde/", "savePersonMeasureResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.storage.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CommitDayResponse }
     * 
     */
    public CommitDayResponse createCommitDayResponse() {
        return new CommitDayResponse();
    }

    /**
     * Create an instance of {@link ReadMeasureTypesResponse }
     * 
     */
    public ReadMeasureTypesResponse createReadMeasureTypesResponse() {
        return new ReadMeasureTypesResponse();
    }

    /**
     * Create an instance of {@link SearchFood }
     * 
     */
    public SearchFood createSearchFood() {
        return new SearchFood();
    }

    /**
     * Create an instance of {@link EditExerciseEntry }
     * 
     */
    public EditExerciseEntry createEditExerciseEntry() {
        return new EditExerciseEntry();
    }

    /**
     * Create an instance of {@link SetInfoResponse }
     * 
     */
    public SetInfoResponse createSetInfoResponse() {
        return new SetInfoResponse();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonMeasureResponse }
     * 
     */
    public UpdatePersonMeasureResponse createUpdatePersonMeasureResponse() {
        return new UpdatePersonMeasureResponse();
    }

    /**
     * Create an instance of {@link GetExercises }
     * 
     */
    public GetExercises createGetExercises() {
        return new GetExercises();
    }

    /**
     * Create an instance of {@link GetExerciseEntry }
     * 
     */
    public GetExerciseEntry createGetExerciseEntry() {
        return new GetExerciseEntry();
    }

    /**
     * Create an instance of {@link GetPersonByChatIdResponse }
     * 
     */
    public GetPersonByChatIdResponse createGetPersonByChatIdResponse() {
        return new GetPersonByChatIdResponse();
    }

    /**
     * Create an instance of {@link SaveTemplateResponse }
     * 
     */
    public SaveTemplateResponse createSaveTemplateResponse() {
        return new SaveTemplateResponse();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link SavePersonMeasure }
     * 
     */
    public SavePersonMeasure createSavePersonMeasure() {
        return new SavePersonMeasure();
    }

    /**
     * Create an instance of {@link SavePersonMeasureResponse }
     * 
     */
    public SavePersonMeasureResponse createSavePersonMeasureResponse() {
        return new SavePersonMeasureResponse();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link EditExerciseEntryResponse }
     * 
     */
    public EditExerciseEntryResponse createEditExerciseEntryResponse() {
        return new EditExerciseEntryResponse();
    }

    /**
     * Create an instance of {@link GetFood }
     * 
     */
    public GetFood createGetFood() {
        return new GetFood();
    }

    /**
     * Create an instance of {@link ReadMeasureTypes }
     * 
     */
    public ReadMeasureTypes createReadMeasureTypes() {
        return new ReadMeasureTypes();
    }

    /**
     * Create an instance of {@link GetExerciseEntryResponse }
     * 
     */
    public GetExerciseEntryResponse createGetExerciseEntryResponse() {
        return new GetExerciseEntryResponse();
    }

    /**
     * Create an instance of {@link SearchFoodResponse }
     * 
     */
    public SearchFoodResponse createSearchFoodResponse() {
        return new SearchFoodResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonMeasure }
     * 
     */
    public UpdatePersonMeasure createUpdatePersonMeasure() {
        return new UpdatePersonMeasure();
    }

    /**
     * Create an instance of {@link ReadPersonHistoryResponse }
     * 
     */
    public ReadPersonHistoryResponse createReadPersonHistoryResponse() {
        return new ReadPersonHistoryResponse();
    }

    /**
     * Create an instance of {@link GetPersonByChatId }
     * 
     */
    public GetPersonByChatId createGetPersonByChatId() {
        return new GetPersonByChatId();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link ReadPersonHistory }
     * 
     */
    public ReadPersonHistory createReadPersonHistory() {
        return new ReadPersonHistory();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
    }

    /**
     * Create an instance of {@link SaveTemplate }
     * 
     */
    public SaveTemplate createSaveTemplate() {
        return new SaveTemplate();
    }

    /**
     * Create an instance of {@link GetPeopleListResponse }
     * 
     */
    public GetPeopleListResponse createGetPeopleListResponse() {
        return new GetPeopleListResponse();
    }

    /**
     * Create an instance of {@link ReadPerson }
     * 
     */
    public ReadPerson createReadPerson() {
        return new ReadPerson();
    }

    /**
     * Create an instance of {@link CommitDay }
     * 
     */
    public CommitDay createCommitDay() {
        return new CommitDay();
    }

    /**
     * Create an instance of {@link ReadPersonMeasure }
     * 
     */
    public ReadPersonMeasure createReadPersonMeasure() {
        return new ReadPersonMeasure();
    }

    /**
     * Create an instance of {@link SetInfo }
     * 
     */
    public SetInfo createSetInfo() {
        return new SetInfo();
    }

    /**
     * Create an instance of {@link ReadPersonMeasureResponse }
     * 
     */
    public ReadPersonMeasureResponse createReadPersonMeasureResponse() {
        return new ReadPersonMeasureResponse();
    }

    /**
     * Create an instance of {@link GetExercisesResponse }
     * 
     */
    public GetExercisesResponse createGetExercisesResponse() {
        return new GetExercisesResponse();
    }

    /**
     * Create an instance of {@link GetFoodResponse }
     * 
     */
    public GetFoodResponse createGetFoodResponse() {
        return new GetFoodResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link GetPeopleList }
     * 
     */
    public GetPeopleList createGetPeopleList() {
        return new GetPeopleList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExerciseEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "getExerciseEntry")
    public JAXBElement<GetExerciseEntry> createGetExerciseEntry(GetExerciseEntry value) {
        return new JAXBElement<GetExerciseEntry>(_GetExerciseEntry_QNAME, GetExerciseEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExercises }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "getExercises")
    public JAXBElement<GetExercises> createGetExercises(GetExercises value) {
        return new JAXBElement<GetExercises>(_GetExercises_QNAME, GetExercises.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByChatIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "getPersonByChatIdResponse")
    public JAXBElement<GetPersonByChatIdResponse> createGetPersonByChatIdResponse(GetPersonByChatIdResponse value) {
        return new JAXBElement<GetPersonByChatIdResponse>(_GetPersonByChatIdResponse_QNAME, GetPersonByChatIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveTemplateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "saveTemplateResponse")
    public JAXBElement<SaveTemplateResponse> createSaveTemplateResponse(SaveTemplateResponse value) {
        return new JAXBElement<SaveTemplateResponse>(_SaveTemplateResponse_QNAME, SaveTemplateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "updatePersonMeasureResponse")
    public JAXBElement<UpdatePersonMeasureResponse> createUpdatePersonMeasureResponse(UpdatePersonMeasureResponse value) {
        return new JAXBElement<UpdatePersonMeasureResponse>(_UpdatePersonMeasureResponse_QNAME, UpdatePersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditExerciseEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "editExerciseEntry")
    public JAXBElement<EditExerciseEntry> createEditExerciseEntry(EditExerciseEntry value) {
        return new JAXBElement<EditExerciseEntry>(_EditExerciseEntry_QNAME, EditExerciseEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "setInfoResponse")
    public JAXBElement<SetInfoResponse> createSetInfoResponse(SetInfoResponse value) {
        return new JAXBElement<SetInfoResponse>(_SetInfoResponse_QNAME, SetInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitDayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "commitDayResponse")
    public JAXBElement<CommitDayResponse> createCommitDayResponse(CommitDayResponse value) {
        return new JAXBElement<CommitDayResponse>(_CommitDayResponse_QNAME, CommitDayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFood }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "searchFood")
    public JAXBElement<SearchFood> createSearchFood(SearchFood value) {
        return new JAXBElement<SearchFood>(_SearchFood_QNAME, SearchFood.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readMeasureTypesResponse")
    public JAXBElement<ReadMeasureTypesResponse> createReadMeasureTypesResponse(ReadMeasureTypesResponse value) {
        return new JAXBElement<ReadMeasureTypesResponse>(_ReadMeasureTypesResponse_QNAME, ReadMeasureTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitDay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "commitDay")
    public JAXBElement<CommitDay> createCommitDay(CommitDay value) {
        return new JAXBElement<CommitDay>(_CommitDay_QNAME, CommitDay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readPersonMeasure")
    public JAXBElement<ReadPersonMeasure> createReadPersonMeasure(ReadPersonMeasure value) {
        return new JAXBElement<ReadPersonMeasure>(_ReadPersonMeasure_QNAME, ReadPersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "setInfo")
    public JAXBElement<SetInfo> createSetInfo(SetInfo value) {
        return new JAXBElement<SetInfo>(_SetInfo_QNAME, SetInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeopleList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "getPeopleList")
    public JAXBElement<GetPeopleList> createGetPeopleList(GetPeopleList value) {
        return new JAXBElement<GetPeopleList>(_GetPeopleList_QNAME, GetPeopleList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readPersonMeasureResponse")
    public JAXBElement<ReadPersonMeasureResponse> createReadPersonMeasureResponse(ReadPersonMeasureResponse value) {
        return new JAXBElement<ReadPersonMeasureResponse>(_ReadPersonMeasureResponse_QNAME, ReadPersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExercisesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "getExercisesResponse")
    public JAXBElement<GetExercisesResponse> createGetExercisesResponse(GetExercisesResponse value) {
        return new JAXBElement<GetExercisesResponse>(_GetExercisesResponse_QNAME, GetExercisesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "getFoodResponse")
    public JAXBElement<GetFoodResponse> createGetFoodResponse(GetFoodResponse value) {
        return new JAXBElement<GetFoodResponse>(_GetFoodResponse_QNAME, GetFoodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readPersonHistory")
    public JAXBElement<ReadPersonHistory> createReadPersonHistory(ReadPersonHistory value) {
        return new JAXBElement<ReadPersonHistory>(_ReadPersonHistory_QNAME, ReadPersonHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "saveTemplate")
    public JAXBElement<SaveTemplate> createSaveTemplate(SaveTemplate value) {
        return new JAXBElement<SaveTemplate>(_SaveTemplate_QNAME, SaveTemplate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readPersonHistoryResponse")
    public JAXBElement<ReadPersonHistoryResponse> createReadPersonHistoryResponse(ReadPersonHistoryResponse value) {
        return new JAXBElement<ReadPersonHistoryResponse>(_ReadPersonHistoryResponse_QNAME, ReadPersonHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByChatId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "getPersonByChatId")
    public JAXBElement<GetPersonByChatId> createGetPersonByChatId(GetPersonByChatId value) {
        return new JAXBElement<GetPersonByChatId>(_GetPersonByChatId_QNAME, GetPersonByChatId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeopleListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "getPeopleListResponse")
    public JAXBElement<GetPeopleListResponse> createGetPeopleListResponse(GetPeopleListResponse value) {
        return new JAXBElement<GetPeopleListResponse>(_GetPeopleListResponse_QNAME, GetPeopleListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditExerciseEntryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "editExerciseEntryResponse")
    public JAXBElement<EditExerciseEntryResponse> createEditExerciseEntryResponse(EditExerciseEntryResponse value) {
        return new JAXBElement<EditExerciseEntryResponse>(_EditExerciseEntryResponse_QNAME, EditExerciseEntryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFood }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "getFood")
    public JAXBElement<GetFood> createGetFood(GetFood value) {
        return new JAXBElement<GetFood>(_GetFood_QNAME, GetFood.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readMeasureTypes")
    public JAXBElement<ReadMeasureTypes> createReadMeasureTypes(ReadMeasureTypes value) {
        return new JAXBElement<ReadMeasureTypes>(_ReadMeasureTypes_QNAME, ReadMeasureTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExerciseEntryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "getExerciseEntryResponse")
    public JAXBElement<GetExerciseEntryResponse> createGetExerciseEntryResponse(GetExerciseEntryResponse value) {
        return new JAXBElement<GetExerciseEntryResponse>(_GetExerciseEntryResponse_QNAME, GetExerciseEntryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFoodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "searchFoodResponse")
    public JAXBElement<SearchFoodResponse> createSearchFoodResponse(SearchFoodResponse value) {
        return new JAXBElement<SearchFoodResponse>(_SearchFoodResponse_QNAME, SearchFoodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "updatePersonMeasure")
    public JAXBElement<UpdatePersonMeasure> createUpdatePersonMeasure(UpdatePersonMeasure value) {
        return new JAXBElement<UpdatePersonMeasure>(_UpdatePersonMeasure_QNAME, UpdatePersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "savePersonMeasure")
    public JAXBElement<SavePersonMeasure> createSavePersonMeasure(SavePersonMeasure value) {
        return new JAXBElement<SavePersonMeasure>(_SavePersonMeasure_QNAME, SavePersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "savePersonMeasureResponse")
    public JAXBElement<SavePersonMeasureResponse> createSavePersonMeasureResponse(SavePersonMeasureResponse value) {
        return new JAXBElement<SavePersonMeasureResponse>(_SavePersonMeasureResponse_QNAME, SavePersonMeasureResponse.class, null, value);
    }

}
