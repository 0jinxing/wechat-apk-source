package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public final class aq
{
  public boolean mInit;
  public String xXM;
  public int xXN;
  public int xXO;
  HashMap<String, String> xXP;
  public HashMap<String, ArrayList<String>> xXQ;
  public HashMap<String, String> xXR;
  public HashMap<String, ArrayList<aq.a>> xXS;
  public Comparator xXT;

  public aq()
  {
    AppMethodBeat.i(62703);
    this.mInit = false;
    this.xXN = 2;
    this.xXO = 32;
    this.xXP = new HashMap();
    this.xXQ = new HashMap();
    this.xXR = new HashMap();
    this.xXS = new HashMap();
    this.xXT = new aq.1(this);
    AppMethodBeat.o(62703);
  }

  public final String Jh(String paramString)
  {
    AppMethodBeat.i(62706);
    if ((this.xXP != null) && (this.xXP.containsKey(paramString)))
    {
      paramString = (String)this.xXP.get(paramString);
      AppMethodBeat.o(62706);
    }
    while (true)
    {
      return paramString;
      paramString = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiStorageMgr().xYp.Jh(paramString);
      AppMethodBeat.o(62706);
    }
  }

  public final void clear()
  {
    AppMethodBeat.i(62704);
    if (this.xXP != null)
      this.xXP.clear();
    if (this.xXQ != null)
      this.xXQ.clear();
    if (this.xXR != null)
      this.xXR.clear();
    if (this.xXS != null)
      this.xXS.clear();
    AppMethodBeat.o(62704);
  }

  public final void dsY()
  {
    AppMethodBeat.i(62705);
    com.tencent.mm.sdk.g.d.xDH.a(new aq.2(this), "MicroMsg.emoji.EmojiDescNewMgr|newinit");
    AppMethodBeat.o(62705);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.aq
 * JD-Core Version:    0.6.2
 */