package centauri.academy.cerepro.persistence.repository.surveyreply;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import centauri.academy.cerepro.persistence.entity.SurveyReply;

/**
 * Provides a repository for the SurveyReply entity
 * 
 * @author Centauri Academy
 *
 */
@Repository
public interface SurveyReplyRepository extends JpaRepository<SurveyReply, Long>, SurveyReplyRepositoryCustom {
	
	List<SurveyReply> findBySurveyId(long surveyId);
	List<SurveyReply> findByUserId(long userId);
	
//	@Query("SELECT  FROM Person p WHERE LOWER(p.lastName) = LOWER(:lastName)")
	@Query("select count(id) from SurveyReply  where endtime between :start and :end")
	long getSurveyReplyCountBetweenDates(LocalDateTime start, LocalDateTime end) ;
	
	@Query("select count(id) from SurveyReply where endtime >=  :ldtstart AND endtime < :ldtend")
	long getSurveyReplyCountToday(LocalDateTime ldtstart, LocalDateTime ldtend);
		 

}
