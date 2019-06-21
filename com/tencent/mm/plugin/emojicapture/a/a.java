package com.tencent.mm.plugin.emojicapture.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.ya;
import com.tencent.mm.protocal.protobuf.yb;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/cgi/CgiTextAntiSpam;", "Lcom/tencent/mm/modelbase/Cgi;", "Lcom/tencent/mm/protocal/protobuf/EmojiTextAntiSpamResponse;", "text", "", "(Ljava/lang/String;)V", "TAG", "getTAG", "()Ljava/lang/String;", "getText", "plugin-emojicapture_release"})
public final class a extends com.tencent.mm.ai.a<yb>
{
  private final String TAG;
  private final String text;

  public a(String paramString)
  {
    AppMethodBeat.i(2568);
    this.text = paramString;
    this.TAG = "MicroMsg.CgiTextAntiSpam";
    b.a locala = new b.a();
    paramString = new ya();
    paramString.wdK = this.text;
    locala.a((com.tencent.mm.bt.a)paramString);
    locala.b((com.tencent.mm.bt.a)new yb());
    locala.qq("/cgi-bin/micromsg-bin/mmemojitextantispam");
    locala.kU(532);
    a(locala.acD());
    ab.i(this.TAG, "Check text anti spam " + this.text);
    AppMethodBeat.o(2568);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.a.a
 * JD-Core Version:    0.6.2
 */