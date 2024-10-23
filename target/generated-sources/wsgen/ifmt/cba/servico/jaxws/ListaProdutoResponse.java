
package ifmt.cba.servico.jaxws;

import java.util.ArrayList;
import ifmt.cba.vo.ProdutoVO;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "listaProdutoResponse", namespace = "http://servico.cba.ifmt/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaProdutoResponse", namespace = "http://servico.cba.ifmt/")
public class ListaProdutoResponse {

    @XmlElement(name = "return", namespace = "")
    private ArrayList<ProdutoVO> _return;

    /**
     * 
     * @return
     *     returns ArrayList<ProdutoVO>
     */
    public ArrayList<ProdutoVO> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(ArrayList<ProdutoVO> _return) {
        this._return = _return;
    }

}
