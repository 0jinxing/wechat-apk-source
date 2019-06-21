package com.tencent.mm.ui.chatting.viewitems;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.pluginsdk.ui.chat.c;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.q;

public class ay extends c
{
  public j.b cJM;
  public String cMg;
  public String cMh;
  public String cRS;
  public int cSQ = 0;
  public String chatroomName;
  public String cwg;
  public String dJv;
  public String desc;
  public String designerName;
  public String designerRediretctUrl;
  public int designerUIN;
  public String fiE;
  public String hzj;
  public String iconUrl;
  public int pageType;
  public int position;
  public String secondUrl;
  public int tid;
  public String title;
  public long unn;
  public int uno;
  public String userName;
  public boolean yFW;
  public int ziA;
  public boolean zis;
  public String zit;
  public boolean ziu;
  public boolean ziv;
  public String ziw;
  public boolean zix;
  public Bundle ziy;
  public q ziz;

  public ay()
  {
  }

  public ay(bi parambi, int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2, String paramString6, String paramString7, String paramString8)
  {
    this.cKd = parambi;
    this.yFW = false;
    this.position = paramInt1;
    this.userName = paramString1;
    this.zis = false;
    this.title = paramString2;
    this.cMg = paramString3;
    this.cMh = paramString4;
    this.zit = paramString5;
    this.designerUIN = paramInt2;
    this.designerName = paramString6;
    this.designerRediretctUrl = paramString7;
    this.dJv = paramString8;
  }

  public ay(bi parambi, String paramString)
  {
    this(paramString);
    this.cKd = parambi;
  }

  public ay(bi parambi, String paramString1, String paramString2)
  {
    this.cKd = parambi;
    this.userName = paramString1;
    this.cKd = parambi;
    this.hzj = paramString2;
  }

  private ay(bi parambi, boolean paramBoolean, int paramInt, String paramString)
  {
    this(parambi, paramBoolean, paramInt, paramString, false, null, null, null);
  }

  private ay(bi parambi, boolean paramBoolean, int paramInt, String paramString, byte paramByte)
  {
    this(parambi, paramBoolean, paramInt, paramString);
  }

  public ay(bi parambi, boolean paramBoolean, int paramInt, String paramString, char paramChar)
  {
    this(parambi, paramBoolean, paramInt, paramString, (byte)0);
  }

  public ay(bi parambi, boolean paramBoolean, int paramInt, String paramString1, String paramString2)
  {
    this(parambi, paramBoolean, paramInt, paramString1, (byte)0);
    this.chatroomName = paramString2;
  }

  public ay(bi parambi, boolean paramBoolean1, int paramInt, String paramString1, boolean paramBoolean2, String paramString2, String paramString3, String paramString4)
  {
    this(parambi, paramBoolean1, paramInt, paramString1, paramBoolean2, paramString2, paramString3, paramString4, null);
  }

  public ay(bi parambi, boolean paramBoolean1, int paramInt, String paramString1, boolean paramBoolean2, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this(parambi, paramBoolean1, paramInt, paramString1, paramBoolean2, paramString2, paramString3, paramString4, paramString5, null, null, false, false);
  }

  public ay(bi parambi, boolean paramBoolean1, int paramInt, String paramString1, boolean paramBoolean2, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, boolean paramBoolean3, boolean paramBoolean4)
  {
    this.cKd = parambi;
    this.yFW = paramBoolean1;
    this.position = paramInt;
    this.userName = paramString1;
    this.zis = paramBoolean2;
    this.title = paramString2;
    this.cMg = paramString3;
    this.cMh = paramString4;
    this.zit = paramString5;
    this.cwg = paramString6;
    this.dJv = paramString7;
    this.ziu = paramBoolean3;
    this.ziv = paramBoolean4;
  }

  private ay(String paramString)
  {
    this.userName = paramString;
  }

  public ay(String paramString1, String paramString2)
  {
    this.userName = paramString1;
    this.chatroomName = paramString2;
  }

  public static ay a(j.b paramb, bi parambi)
  {
    AppMethodBeat.i(33444);
    ay localay = new ay();
    localay.cJM = paramb;
    localay.cKd = parambi;
    AppMethodBeat.o(33444);
    return localay;
  }

  public static ay arL(String paramString)
  {
    AppMethodBeat.i(33443);
    ay localay = new ay();
    localay.dJv = paramString;
    AppMethodBeat.o(33443);
    return localay;
  }

  public static ay b(bi parambi, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(33445);
    ay localay = new ay();
    localay.cKd = parambi;
    localay.yFW = paramBoolean;
    localay.position = paramInt;
    localay.zix = false;
    AppMethodBeat.o(33445);
    return localay;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ay
 * JD-Core Version:    0.6.2
 */