package com.tencent.mm.plugin.emojicapture.model.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiStickerInfo;", "", "()V", "iconPath", "", "getIconPath", "()Ljava/lang/String;", "setIconPath", "(Ljava/lang/String;)V", "lensId", "getLensId", "setLensId", "name", "getName", "setName", "resPath", "getResPath", "setResPath", "subType", "", "getSubType", "()I", "setSubType", "(I)V", "tipIcons", "Ljava/util/LinkedList;", "getTipIcons", "()Ljava/util/LinkedList;", "setTipIcons", "(Ljava/util/LinkedList;)V", "tips", "getTips", "setTips", "title", "getTitle", "setTitle", "titleColor", "getTitleColor", "setTitleColor", "valid", "", "getValid", "()Z", "setValid", "(Z)V", "version", "getVersion", "setVersion", "isTipsValid", "toString", "plugin-emojicapture_release"})
public final class b
{
  public boolean ajN;
  int cuu;
  public String fhL;
  public String hNN;
  public String kfM;
  public String lgY;
  public String lhL;
  public LinkedList<String> lhM;
  public String name;
  public String title;
  int version;

  public b()
  {
    AppMethodBeat.i(2638);
    this.lgY = "";
    this.hNN = "";
    this.lhL = "";
    this.name = "";
    this.title = "";
    this.fhL = "";
    this.kfM = "";
    this.lhM = new LinkedList();
    AppMethodBeat.o(2638);
  }

  public final String toString()
  {
    AppMethodBeat.i(2637);
    String str = "EmojiStickerInfo(subType=" + this.cuu + ", version=" + this.version + ", valid=" + this.ajN + ", lensId='" + this.lgY + "', iconPath='" + this.hNN + "', resPath='" + this.lhL + "', name='" + this.name + "', title='" + this.title + "', titleColor='" + this.fhL + "', tips='" + this.kfM + "', tipIcons=" + this.lhM + ')';
    AppMethodBeat.o(2637);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.a.b
 * JD-Core Version:    0.6.2
 */