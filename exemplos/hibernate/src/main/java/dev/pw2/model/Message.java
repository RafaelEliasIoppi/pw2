/**
 * PW2 by Rodrigo Prestes Machado
 *
 * PW2 is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 *
*/
package dev.pw2.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Setter @Getter
public class Message extends PanacheEntity {

    private String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
