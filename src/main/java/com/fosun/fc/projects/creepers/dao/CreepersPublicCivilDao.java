package com.fosun.fc.projects.creepers.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fosun.fc.projects.creepers.entity.TCreepersPublicCivil;
/**
 * 
 *<p>
 *description:
 *简版征信民事判决记录信息表
 *</p>
 * @author MaXin
 * @since 2016年5月25日
 * @see
 */
public interface CreepersPublicCivilDao
        extends JpaRepository<TCreepersPublicCivil, Long>, JpaSpecificationExecutor<TCreepersPublicCivil> {

    @Query("select t from TCreepersPublicCivil t where t.rptNo = :rptNo")
    List<TCreepersPublicCivil> queryByRptNo(@Param("rptNo")String rptNo);

}
