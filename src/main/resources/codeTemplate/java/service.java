package ${package};


{basePackage}.dao.${entity.name}Dao;
import ${basePackage}.entity.${entity.name};


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * ${entity.displayName} Service
 */

\@Service
\@Transactional
public class ${entity.name}Service extends CoreBaseService<${entity.name}>{

    \@Autowired private ${entity.name}Dao ${entity.code}Dao;

    public PageQuery<${entity.name}>queryByCondition(PageQuery query){
        PageQuery ret =  ${entity.code}Dao.queryByCondition(query);
        queryListAfter(ret.getList());
        return ret;
    }

    public void batchDel${entity.name}(List<Long> ids){
        try {
            ${entity.code}Dao.batchDel${entity.name}ByIds(ids);
        } catch (Exception e) {
            throw new PlatformException("批量删除${entity.displayName}失败", e);
        }
    }
}
