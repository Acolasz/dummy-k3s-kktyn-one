package hu.kukutyin.dummy.k3s.kktyn.one.service.app.entity;

import hu.kukutyin.dummy.k3s.kktyn.one.service.app.valueset.EntitiesConstants;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = EntitiesConstants.CONSTANTS_TABLE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ConstantsEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Generated unique ID with sequence
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * A group of keys
     */
    private String groupId;
    /**
     * Key
     */
    private String groupIdKey;

    /**
     * Value of key
     */
    private String groupIdValue;

    /**
     * Description od key rows
     */
    private String description;
}
