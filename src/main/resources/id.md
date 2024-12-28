```sql


SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for id_card
-- ----------------------------
DROP TABLE IF EXISTS `id_card`;
CREATE TABLE ` id_card `
(
    `
    id`        varchar(18) CHARACTER
        SET
        utf8mb4
        COLLATE
            utf8mb4_unicode_ci
        NOT
            NULL
        COMMENT
            'id',
    `
       name`  varchar(20) CHARACTER
        SET
        utf8mb4
        COLLATE
            utf8mb4_unicode_ci
        NOT
            NULL
        COMMENT
            '姓名',
    `
       month` varchar(10) CHARACTER
        SET
        utf8mb4
        COLLATE
            utf8mb4_unicode_ci
        NULL
        DEFAULT
            NULL
        COMMENT
            '月',
    PRIMARY KEY (` id `) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_unicode_ci
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of id_card
-- ----------------------------
INSERT INTO ` id_card `
VALUES ('110221198607115061', '李天明', '7');
INSERT INTO ` id_card `
VALUES ('120221199003230014', '杨宇', '3');
INSERT INTO ` id_card `
VALUES ('130322197406161273', '潘锡东', '6');
INSERT INTO ` id_card `
VALUES ('130406198609230312', '孟可', '9');
INSERT INTO ` id_card `
VALUES ('131181199302223512', '张宗晓', '2');
INSERT INTO ` id_card `
VALUES ('140123197305096932', '王晓蓓', '5');
INSERT INTO ` id_card `
VALUES ('140424197511290536', '顾振红', '11');
INSERT INTO ` id_card `
VALUES ('140481199205134013', '吴彦', '5');
INSERT INTO ` id_card `
VALUES ('142322199110213030', '权贝贝', '10');
INSERT INTO ` id_card `
VALUES ('142701198401031224', '许杨晶', '1');
INSERT INTO ` id_card `
VALUES ('142723199902093813', '张晋泰', '2');
INSERT INTO ` id_card `
VALUES ('142727199402282621', '王辉', '2');
INSERT INTO ` id_card `
VALUES ('152723198811290093', '贾宇', '11');
INSERT INTO ` id_card `
VALUES ('210211198109034032', '于游洋', '9');
INSERT INTO ` id_card `
VALUES ('210402198007231320', '金慧敏', '7');
INSERT INTO ` id_card `
VALUES ('210727198308133015', '李猛', '8');
INSERT INTO ` id_card `
VALUES ('220181197401159538', '陆启丰', '1');
INSERT INTO ` id_card `
VALUES ('220221197008290897', '侯文远', '8');
INSERT INTO ` id_card `
VALUES ('220302198205050412', '庞宏伟', '5');
INSERT INTO ` id_card `
VALUES ('230226195701150045', '杨玉霞', '1');
INSERT INTO ` id_card `
VALUES ('230227197004220015', '张军', '4');
INSERT INTO ` id_card `
VALUES ('230227198601300026', '徐玲燕', '1');
INSERT INTO ` id_card `
VALUES ('23042219680519195X', '焦叙军', '5');
INSERT INTO ` id_card `
VALUES ('230716198508113312', '郑兴国', '8');
INSERT INTO ` id_card `
VALUES ('230882198407019852', '杨宜东', '7');
INSERT INTO ` id_card `
VALUES ('310102196910221215', '张永生', '10');
INSERT INTO ` id_card `
VALUES ('310105198007152020', '邹晔', '7');
INSERT INTO ` id_card `
VALUES ('310109198001215225', '杨洁', '1');
INSERT INTO ` id_card `
VALUES ('310114198211221237', '张伟', '11');
INSERT INTO ` id_card `
VALUES ('320106198410290421', '周文君', '10');
INSERT INTO ` id_card `
VALUES ('320121198302010019', '任世春', '2');
INSERT INTO ` id_card `
VALUES ('320121198906164182', '李轩', '6');
INSERT INTO ` id_card `
VALUES ('320122198711124435', '金波', '11');
INSERT INTO ` id_card `
VALUES ('320222197510010563', '汤晔', '10');
INSERT INTO ` id_card `
VALUES ('320283198612130977', '许磊', '12');
INSERT INTO ` id_card `
VALUES ('320304198808240035', '王浩', '8');
INSERT INTO ` id_card `
VALUES ('320321199408082219', '毛立东', '8');
INSERT INTO ` id_card `
VALUES ('320322196504180313', '封新桥', '4');
INSERT INTO ` id_card `
VALUES ('320322196711084770', '朱恒顺', '11');
INSERT INTO ` id_card `
VALUES ('320322197501180064', '马洪晶', '1');
INSERT INTO ` id_card `
VALUES ('320322197706147321', '陶春梅', '6');
INSERT INTO ` id_card `
VALUES ('320322198506221632', '康凯', '6');
INSERT INTO ` id_card `
VALUES ('32032219861001342X', '李洁', '10');
INSERT INTO ` id_card `
VALUES ('320322198612160861', '吴倩', '12');
INSERT INTO ` id_card `
VALUES ('320322198612302532', '左佰敬', '12');
INSERT INTO ` id_card `
VALUES ('320322198706183837', '李维让', '6');
INSERT INTO ` id_card `
VALUES ('320322199107112265', '王莉萍', '7');
INSERT INTO ` id_card `
VALUES ('320322199111099040', '张盼', '11');
INSERT INTO ` id_card `
VALUES ('320322199202082359', '蔡承洲', '2');
INSERT INTO ` id_card `
VALUES ('320322199907255926', '姜硕', '7');
INSERT INTO ` id_card `
VALUES ('320322200001318623', '冯文杰', '1');
INSERT INTO ` id_card `
VALUES ('320324199801052170', '彭阳', '1');
INSERT INTO ` id_card `
VALUES ('320382198912316254', '秦赛', '12');
INSERT INTO ` id_card `
VALUES ('320404198106154410', '陈路', '6');
INSERT INTO ` id_card `
VALUES ('320422197810180805', '王俊芳', '10');
INSERT INTO ` id_card `
VALUES ('320581198807154462', '赵菊汶', '7');
INSERT INTO ` id_card `
VALUES ('320582198311152013', '沈建东', '11');
INSERT INTO ` id_card `
VALUES ('320602197305064315', '李齐安', '5');
INSERT INTO ` id_card `
VALUES ('320602197607038753', '张励图', '7');
INSERT INTO ` id_card `
VALUES ('320621197307052026', '王琴', '7');
INSERT INTO ` id_card `
VALUES ('32062119790219351X', '葛亚明', '2');
INSERT INTO ` id_card `
VALUES ('320621197906113513', '朱兆兵', '6');
INSERT INTO ` id_card `
VALUES ('320621198112237922', '颜夕兰', '12');
INSERT INTO ` id_card `
VALUES ('320621198304153539', '杨余华', '4');
INSERT INTO ` id_card `
VALUES ('320621198307074318', '张进', '7');
INSERT INTO ` id_card `
VALUES ('320621198406182824', '袁美青', '6');
INSERT INTO ` id_card `
VALUES ('320621198411140522', '周余金', '11');
INSERT INTO ` id_card `
VALUES ('320621198611063517', '陈忠华', '11');
INSERT INTO ` id_card `
VALUES ('320621198702258512', '张春洋', '2');
INSERT INTO ` id_card `
VALUES ('320621198810051447', '卢慧敏', '10');
INSERT INTO ` id_card `
VALUES ('320621199112260051', '奚捷', '12');
INSERT INTO ` id_card `
VALUES ('320621199310086349', '张蓉', '10');
INSERT INTO ` id_card `
VALUES ('320621199612034747', '邓璐璐', '12');
INSERT INTO ` id_card `
VALUES ('320621199707280027', '刘巧', '7');
INSERT INTO ` id_card `
VALUES ('320621199807126318', '汪宝圣', '7');
INSERT INTO ` id_card `
VALUES ('320621199908073710', '曹阳', '8');
INSERT INTO ` id_card `
VALUES ('320626197612163218', '黄卫华', '12');
INSERT INTO ` id_card `
VALUES ('320681199508241822', '范佳雯', '8');
INSERT INTO ` id_card `
VALUES ('320681199806116018', '张天豪', '6');
INSERT INTO ` id_card `
VALUES ('320682198206254670', '孙晶晶', '6');
INSERT INTO ` id_card `
VALUES ('320682198711046434', '丁阳', '11');
INSERT INTO ` id_card `
VALUES ('320683198512093154', '何伟聪', '12');
INSERT INTO ` id_card `
VALUES ('320684198810164439', '俞挺挺', '10');
INSERT INTO ` id_card `
VALUES ('320684198811115911', '姜彬', '11');
INSERT INTO ` id_card `
VALUES ('320704199502093016', '江怀', '2');
INSERT INTO ` id_card `
VALUES ('320704199802133032', '张虎', '2');
INSERT INTO ` id_card `
VALUES ('320704199907273023', '王敏星', '7');
INSERT INTO ` id_card `
VALUES ('320705198208021515', '张建', '8');
INSERT INTO ` id_card `
VALUES ('320721199606014227', '李杰', '6');
INSERT INTO ` id_card `
VALUES ('320722199906121629', '刘凤', '6');
INSERT INTO ` id_card `
VALUES ('32080219820201218X', '张雨红', '2');
INSERT INTO ` id_card `
VALUES ('32080219861022101X', '陈海洲', '10');
INSERT INTO ` id_card `
VALUES ('320802199012013020', '章一婧', '12');
INSERT INTO ` id_card `
VALUES ('320803200107254216', '韩旭', '7');
INSERT INTO ` id_card `
VALUES ('32080420010621311X', '吴志豪', '6');
INSERT INTO ` id_card `
VALUES ('320811198001030521', '王维', '1');
INSERT INTO ` id_card `
VALUES ('320821198010200919', '董青', '10');
INSERT INTO ` id_card `
VALUES ('32082119810702494X', '隽晓琴', '7');
INSERT INTO ` id_card `
VALUES ('320821198110010514', '徐磊', '10');
INSERT INTO ` id_card `
VALUES ('320821198202271711', '颜波', '2');
INSERT INTO ` id_card `
VALUES ('320821198507315703', '张晓燕', '7');
INSERT INTO ` id_card `
VALUES ('320821200011225114', '卞太阳', '11');
INSERT INTO ` id_card `
VALUES ('320821200011305114', '赵义', '11');
INSERT INTO ` id_card `
VALUES ('32082120010601191X', '杨震', '6');
INSERT INTO ` id_card `
VALUES ('320821200107050718', '王金龙', '7');
INSERT INTO ` id_card `
VALUES ('320821200107200114', '刘心宇', '7');
INSERT INTO ` id_card `
VALUES ('320821200107220713', '孙润之', '7');
INSERT INTO ` id_card `
VALUES ('320823198206023224', '汪秀芹', '6');
INSERT INTO ` id_card `
VALUES ('320825198001045916', '王金梁', '1');
INSERT INTO ` id_card `
VALUES ('32082719790126117X', '王道光', '1');
INSERT INTO ` id_card `
VALUES ('320829197911200103', '杨植芹', '11');
INSERT INTO ` id_card `
VALUES ('320829198308251410', '郑建忠', '8');
INSERT INTO ` id_card `
VALUES ('320829198804251022', '谢珍', '4');
INSERT INTO ` id_card `
VALUES ('320829198810020044', '陈中华', '10');
INSERT INTO ` id_card `
VALUES ('32082919891006161X', '陈健', '10');
INSERT INTO ` id_card `
VALUES ('320829198910081020', '马雨菊', '10');
INSERT INTO ` id_card `
VALUES ('32082919891021062X', '曹文倩', '10');
INSERT INTO ` id_card `
VALUES ('320829199002240422', '韦邵婷', '2');
INSERT INTO ` id_card `
VALUES ('320829199004200010', '蒋立中', '4');
INSERT INTO ` id_card `
VALUES ('320829199008281065', '邵秋霞', '8');
INSERT INTO ` id_card `
VALUES ('320829199011171625', '邓虹', '11');
INSERT INTO ` id_card `
VALUES ('320829199510100450', '夏志雨', '10');
INSERT INTO ` id_card `
VALUES ('32083019800204502X', '韩霞', '2');
INSERT INTO ` id_card `
VALUES ('320830198311050041', '王静', '11');
INSERT INTO ` id_card `
VALUES ('320830198511160034', '朱子亮', '11');
INSERT INTO ` id_card `
VALUES ('320830198606240619', '马文亮', '6');
INSERT INTO ` id_card `
VALUES ('320830198612131419', '宋杰', '12');
INSERT INTO ` id_card `
VALUES ('320830199308181010', '张文', '8');
INSERT INTO ` id_card `
VALUES ('32083019991218201X', '张怀宇', '12');
INSERT INTO ` id_card `
VALUES ('320911196710304632', '夏信尧', '10');
INSERT INTO ` id_card `
VALUES ('320921199602166371', '刘海峰', '2');
INSERT INTO ` id_card `
VALUES ('320922198410113912', '孟宪冲', '10');
INSERT INTO ` id_card `
VALUES ('32092619781126128X', '施燕娟', '11');
INSERT INTO ` id_card `
VALUES ('320981198701215740', '王俊梅', '1');
INSERT INTO ` id_card `
VALUES ('321022196810131565', '王娟', '10');
INSERT INTO ` id_card `
VALUES ('321022197207015011', '翁长武', '7');
INSERT INTO ` id_card `
VALUES ('321023197304274214', '李兵', '4');
INSERT INTO ` id_card `
VALUES ('321023199410126273', '郑玉松', '10');
INSERT INTO ` id_card `
VALUES ('321028196907214023', '赵秀红', '7');
INSERT INTO ` id_card `
VALUES ('321084197408130875', '姚礼华', '8');
INSERT INTO ` id_card `
VALUES ('321084197602211310', '许维海', '2');
INSERT INTO ` id_card `
VALUES ('321084197610203417', '郭兆海', '10');
INSERT INTO ` id_card `
VALUES ('321084197804021355', '陈超', '4');
INSERT INTO ` id_card `
VALUES ('321084198402155814', '张国祥', '2');
INSERT INTO ` id_card `
VALUES ('321084198502236523', '居玲玲', '2');
INSERT INTO ` id_card `
VALUES ('321084198701151725', '居文华', '1');
INSERT INTO ` id_card `
VALUES ('321084198711212827', '张菲', '11');
INSERT INTO ` id_card `
VALUES ('321084198811111716', '孙汝超', '11');
INSERT INTO ` id_card `
VALUES ('321084199011186546', '居敏', '11');
INSERT INTO ` id_card `
VALUES ('321084199011254625', '陈茜', '11');
INSERT INTO ` id_card `
VALUES ('321084199111160415', '房学智', '11');
INSERT INTO ` id_card `
VALUES ('321084199112073022', '仇欣欣', '12');
INSERT INTO ` id_card `
VALUES ('321084199404192111', '周涛', '4');
INSERT INTO ` id_card `
VALUES ('321084199411301726', '张静', '11');
INSERT INTO ` id_card `
VALUES ('321084199412221525', '秦莉', '12');
INSERT INTO ` id_card `
VALUES ('321084199612111179', '管欣', '12');
INSERT INTO ` id_card `
VALUES ('321084199711140012', '冯强', '11');
INSERT INTO ` id_card `
VALUES ('321084200107170413', '刘德舟', '7');
INSERT INTO ` id_card `
VALUES ('321282198110275214', '钱海俊', '10');
INSERT INTO ` id_card `
VALUES ('330127197811200043', '余丽萍', '11');
INSERT INTO ` id_card `
VALUES ('330224197510040812', '王威', '10');
INSERT INTO ` id_card `
VALUES ('330226198911237031', '王必忠', '11');
INSERT INTO ` id_card `
VALUES ('330227195604251266', '董晓飞', '4');
INSERT INTO ` id_card `
VALUES ('330328199311150226', '严冬琴', '11');
INSERT INTO ` id_card `
VALUES ('330328199608260610', '雷汉森', '8');
INSERT INTO ` id_card `
VALUES ('33042119930407959X', '梁佳林', '4');
INSERT INTO ` id_card `
VALUES ('330482197904124810', '韩忠伟', '4');
INSERT INTO ` id_card `
VALUES ('330602196712021010', '陈志东', '12');
INSERT INTO ` id_card `
VALUES ('330621196810230499', '金兴根', '10');
INSERT INTO ` id_card `
VALUES ('330681199508292939', '马孝杰', '8');
INSERT INTO ` id_card `
VALUES ('330702197708196213', '钱江', '8');
INSERT INTO ` id_card `
VALUES ('330721197809105463', '李霞', '9');
INSERT INTO ` id_card `
VALUES ('332529198509040019', '马勇涌', '9');
INSERT INTO ` id_card `
VALUES ('340111196911091071', '张伟', '11');
INSERT INTO ` id_card `
VALUES ('340123199707237490', '程超', '7');
INSERT INTO ` id_card `
VALUES ('340621198810207599', '张亚坤', '10');
INSERT INTO ` id_card `
VALUES ('340827198410160057', '汪南', '10');
INSERT INTO ` id_card `
VALUES ('341122199202142239', '孙波', '2');
INSERT INTO ` id_card `
VALUES ('341225199908011315', '张海天', '8');
INSERT INTO ` id_card `
VALUES ('342221198401203597', '朱鹏远', '1');
INSERT INTO ` id_card `
VALUES ('342221199201022024', '高苗', '1');
INSERT INTO ` id_card `
VALUES ('342224199102091293', '鲁强', '2');
INSERT INTO ` id_card `
VALUES ('342623198211160324', '任晓骏', '11');
INSERT INTO ` id_card `
VALUES ('34262619741008017X', '傅存国', '10');
INSERT INTO ` id_card `
VALUES ('342921197608253333', '郑兵', '8');
INSERT INTO ` id_card `
VALUES ('342922198709022279', '洪登志', '9');
INSERT INTO ` id_card `
VALUES ('342922198812172021', '何冬琴', '12');
INSERT INTO ` id_card `
VALUES ('350524198909067456', '易伟铭', '9');
INSERT INTO ` id_card `
VALUES ('350623198107140518', '郑木城', '7');
INSERT INTO ` id_card `
VALUES ('350702198801230816', '陈文韬', '1');
INSERT INTO ` id_card `
VALUES ('350783198704241511', '徐捷', '4');
INSERT INTO ` id_card `
VALUES ('362201198701126261', '陆芳', '1');
INSERT INTO ` id_card `
VALUES ('370285198110183819', '李特', '10');
INSERT INTO ` id_card `
VALUES ('370481198707043232', '韩峰', '7');
INSERT INTO ` id_card `
VALUES ('370782198611251419', '张晓峰', '11');
INSERT INTO ` id_card `
VALUES ('370882198903184217', '刘胜', '3');
INSERT INTO ` id_card `
VALUES ('370911199407226013', '王正中', '7');
INSERT INTO ` id_card `
VALUES ('371002198811103032', '王君芳', '11');
INSERT INTO ` id_card `
VALUES ('372301198107053837', '李中', '7');
INSERT INTO ` id_card `
VALUES ('410328199104155083', '王乐雁', '4');
INSERT INTO ` id_card `
VALUES ('410422199011103329', '张艳鸽', '11');
INSERT INTO ` id_card `
VALUES ('410482200007063020', '翟梦阳', '7');
INSERT INTO ` id_card `
VALUES ('410727199107126216', '郭召磊', '7');
INSERT INTO ` id_card `
VALUES ('410821198608184011', '朱红亮', '8');
INSERT INTO ` id_card `
VALUES ('410825199009175033', '岳京礼', '9');
INSERT INTO ` id_card `
VALUES ('410901198811275015', '许兵', '11');
INSERT INTO ` id_card `
VALUES ('41092219850216492X', '王红敏', '2');
INSERT INTO ` id_card `
VALUES ('411002199001121017', '杨睿韬', '1');
INSERT INTO ` id_card `
VALUES ('411224198907206791', '开丰年', '7');
INSERT INTO ` id_card `
VALUES ('411282198802023634', '赵万锋', '2');
INSERT INTO ` id_card `
VALUES ('411325199306231357', '何可', '6');
INSERT INTO ` id_card `
VALUES ('411425199503207917', '楚召坤', '3');
INSERT INTO ` id_card `
VALUES ('411526198611053537', '孙浩', '11');
INSERT INTO ` id_card `
VALUES ('412701200007163574', '董记龙', '7');
INSERT INTO ` id_card `
VALUES ('412725198512077459', '岳千里', '12');
INSERT INTO ` id_card `
VALUES ('420704199208191620', '严雨萌', '8');
INSERT INTO ` id_card `
VALUES ('42092319830211095X', '刘国君', '2');
INSERT INTO ` id_card `
VALUES ('42102319890325001X', '刘凡', '3');
INSERT INTO ` id_card `
VALUES ('421121199302064825', '童婷', '2');
INSERT INTO ` id_card `
VALUES ('421381199110114055', '陈立', '10');
INSERT INTO ` id_card `
VALUES ('422130198004275416', '杨为新', '4');
INSERT INTO ` id_card `
VALUES ('422429195111201110', '罗成龙', '11');
INSERT INTO ` id_card `
VALUES ('422429197301250895', '邹郁', '1');
INSERT INTO ` id_card `
VALUES ('422823198810050654', '刘伟', '10');
INSERT INTO ` id_card `
VALUES ('429005195411190875', '王绪平', '11');
INSERT INTO ` id_card `
VALUES ('430381198607298810', '陈磊', '7');
INSERT INTO ` id_card `
VALUES ('430521197211040063', '王双跃', '11');
INSERT INTO ` id_card `
VALUES ('432823196810110517', '汪建秋', '10');
INSERT INTO ` id_card `
VALUES ('440102198609040026', '姚瑶', '9');
INSERT INTO ` id_card `
VALUES ('440111198601063019', '赖国城', '1');
INSERT INTO ` id_card `
VALUES ('440222199308021214', '陈小明', '8');
INSERT INTO ` id_card `
VALUES ('460033198306124823', '罗盛梅', '6');
INSERT INTO ` id_card `
VALUES ('500237199808058911', '许孝杰', '8');
INSERT INTO ` id_card `
VALUES ('510283198111268631', '秦友兵', '11');
INSERT INTO ` id_card `
VALUES ('510302196805040517', '张祁', '5');
INSERT INTO ` id_card `
VALUES ('510321199201086197', '朱文利', '1');
INSERT INTO ` id_card `
VALUES ('510922198506175208', '何显华', '6');
INSERT INTO ` id_card `
VALUES ('511025199705100394', '张昌明', '5');
INSERT INTO ` id_card `
VALUES ('511223198205233733', '颜宁飞', '5');
INSERT INTO ` id_card `
VALUES ('511521199101278652', '王云飞', '1');
INSERT INTO ` id_card `
VALUES ('513901199101042939', '郭海军', '1');
INSERT INTO ` id_card `
VALUES ('522423199112114725', '张霞', '12');
INSERT INTO ` id_card `
VALUES ('532325200007120722', '孙晓丹', '7');
INSERT INTO ` id_card `
VALUES ('532429199804081944', '黄春菊', '4');
INSERT INTO ` id_card `
VALUES ('610115198411281290', '杜西林', '11');
INSERT INTO ` id_card `
VALUES ('620111198210160018', '宋威堂', '10');
INSERT INTO ` id_card `
VALUES ('62210119920117311X', '魏坤', '1');
INSERT INTO ` id_card `
VALUES ('622801199901111014', '邢启民', '1');
INSERT INTO ` id_card `
VALUES ('622801199901270015', '魏兆钧', '1');
INSERT INTO ` id_card `
VALUES ('622827199905200931', '谯可立', '5');
INSERT INTO ` id_card `
VALUES ('652122198807101017', '刘振', '7');
INSERT INTO ` id_card `
VALUES ('652201199210241218', '王理鹏', '10');
INSERT INTO ` id_card `
VALUES ('654101198212230012', '杨爽', '12');

SET FOREIGN_KEY_CHECKS = 1;

```

```java
package com.xiaobu.junit;

import cn.hutool.core.util.IdcardUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import com.xiaobu.entity.IdCard;
import com.xiaobu.service.IdCardService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author 小布
 * @className IdCardWriteTest.java
 * @createTime 2022年05月30日 09:26:00
 */
@Slf4j
@SpringBootTest
public class IdCardWriteTest {

    @Resource
    private IdCardService idCardService;


    @Test
    public void writeData() {
        ExcelReader reader = ExcelUtil.getReader("d:/idCard1653890203286.xlsx");
        List<IdCard> all = reader.readAll(IdCard.class);
        try {
            idCardService.insertList(all);
        } catch (Exception e) {
            log.error("[writeData]::e.getMessage() ==> [{}]", e.getMessage());
        }
        System.out.println("all.size() = " + all.size());
    }

    @Test
    public void writeDataFor() {
        String path = "D:\\export";
        File file = new File(path);
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            assert files != null;
            for (File f : files) {
                String name = f.getName();
                if (name.endsWith(".xlsx")) {
                    ExcelReader reader = ExcelUtil.getReader(f.getAbsolutePath());
                    reader.addHeaderAlias("NAME", "name");
                    reader.addHeaderAlias("ID", "id");
                    reader.addHeaderAlias("MONTH", "month");
                    List<IdCard> all = reader.readAll(IdCard.class);
                    Set<IdCard> set = new HashSet<>();
                    for (IdCard idCard : all) {
                        String id = idCard.getId();
                        IdCard card = idCardService.selectById(id);
                        if (card == null) {
                            Short month = IdcardUtil.getMonthByIdCard(id);
                            idCard.setMonth(month.toString());
                            set.add(idCard);
                        }
                    }
                    if (set.size() > 0) {
                        List<IdCard> data = new ArrayList<>(set);
                        try {
                            idCardService.insertList(data);
                        } catch (Exception e) {
                            log.error("[writeData]::e.getMessage() ==> [{}]", e.getMessage());
                        }
                    }
                }
            }
        }
    }


}

```