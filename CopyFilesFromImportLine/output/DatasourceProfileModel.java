package com.p3solutions.metalyzer_service.configured_dbs.models;

import com.p3solutions.metalyzer_service.bean.BaseModel;
import com.p3solutions.metalyzer_service.configured_dbs.enums.AuthType;
import com.p3solutions.metalyzer_service.configured_dbs.enums.DSCategory;
import com.p3solutions.metalyzer_service.configured_dbs.enums.DatasourceProfileStatus;
import com.p3solutions.metalyzer_service.job_service.models.JobListModel;
import lombok.*;
import lombok.Builder.Default;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author syedsirajuddin
 */
@Data
@Builder
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Document(collection = "datasource_profile")
public class DatasourceProfileModel extends BaseModel {

    private String ownerId;
    private String profileName;
    private String description;
    private DSCategory category;
    private AuthType authType;
    @DBRef
    private JobListModel jobStatus;
    private Integer stages;
    private RDBMSConnectionInfoModel rdbmsConnectionDetails;
    @Default
    private Boolean isAlive = false; //Heart beat check(♥)
    @Indexed
    private DatasourceProfileStatus status;
    //it will change ltr..(tmp fix)
    @DBRef
    private List<JobListModel> analyzerJobs;
}
