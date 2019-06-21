package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.protocal.protobuf.acs;
import com.tencent.mm.protocal.protobuf.ccl;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class m extends j<l>
  implements com.tencent.mm.plugin.sns.b.e
{
  public static final String[] fnj;
  public com.tencent.mm.sdk.e.e bSd;
  private boolean rfc;
  private g rfd;

  static
  {
    AppMethodBeat.i(37881);
    fnj = new String[] { j.a(l.ccO, "snsExtInfo3") };
    AppMethodBeat.o(37881);
  }

  public m(com.tencent.mm.sdk.e.e parame, g paramg)
  {
    super(parame, l.ccO, "snsExtInfo3", null);
    AppMethodBeat.i(37861);
    this.rfc = false;
    this.rfd = null;
    this.bSd = parame;
    this.rfd = paramg;
    ab.i("MicroMsg.SnsExtStorage", "createExtStorage " + parame + "  " + Thread.currentThread().getId());
    AppMethodBeat.o(37861);
  }

  private l a(String paramString, l paraml)
  {
    AppMethodBeat.i(37874);
    int i;
    int j;
    if (paraml == null)
    {
      i = 0;
      j = 0;
      k = i;
      label17: if ((j != 0) || (k != 0))
        break label247;
      paraml = this.bSd.a("select count(*)  from sqlite_master where type='table' and name = 'snsExtInfo2'", null, 2);
      if (!paraml.moveToFirst())
        break label257;
    }
    label257: for (int k = paraml.getInt(0); ; k = 0)
    {
      paraml.close();
      if (k == 0)
      {
        ab.v("MicroMsg.SnsExtStorage", "can not get snsextinfo2 %s", new Object[] { paramString });
        AppMethodBeat.o(37874);
        paramString = null;
      }
      while (true)
      {
        return paramString;
        if ((paraml.field_iFlag & 0x1) > 0);
        for (k = 1; ; k = 0)
        {
          i = k;
          if ((paraml.field_local_flag & 0x4) <= 0)
            break;
          j = 1;
          break label17;
        }
        paraml = "select * from snsExtInfo2 where userName=\"" + bo.vA(paramString) + "\"";
        ab.d("MicroMsg.SnsExtStorage", "get from snsextinfo2 sql %s", new Object[] { paraml });
        Cursor localCursor = this.bSd.a(paraml, null, 2);
        paraml = new l();
        if (localCursor.moveToFirst())
        {
          paraml.d(localCursor);
          localCursor.close();
          ab.i("MicroMsg.SnsExtStorage", "setSnsUserInfo fix newversion change snsextinfo3 %s", new Object[] { paramString });
          AppMethodBeat.o(37874);
          paramString = paraml;
        }
        else
        {
          localCursor.close();
          label247: AppMethodBeat.o(37874);
          paramString = null;
        }
      }
    }
  }

  public final ccl WX(String paramString)
  {
    AppMethodBeat.i(37875);
    paramString = YX(paramString);
    if (paramString == null)
    {
      paramString = new ccl();
      AppMethodBeat.o(37875);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.cqK();
      AppMethodBeat.o(37875);
    }
  }

  public final void YU(String paramString)
  {
    AppMethodBeat.i(37864);
    l locall = YX(paramString);
    locall.field_userName = paramString;
    super.a(locall, new String[] { this.xDe.xDc });
    AppMethodBeat.o(37864);
  }

  public final acs YV(String paramString)
  {
    AppMethodBeat.i(37868);
    Object localObject = new acs();
    new l();
    paramString = YX(paramString);
    try
    {
      if (!bo.cb(paramString.field_faultS))
      {
        acs localacs = new com/tencent/mm/protocal/protobuf/acs;
        localacs.<init>();
        paramString = (acs)localacs.parseFrom(paramString.field_faultS);
        localObject = paramString;
        if (paramString == null)
          localObject = new acs();
        AppMethodBeat.o(37868);
        return localObject;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.SnsExtStorage", "parser field_faultS error");
        paramString = (String)localObject;
      }
    }
  }

  public final void YW(String paramString)
  {
    AppMethodBeat.i(37869);
    new l();
    l locall = YX(paramString);
    locall.field_userName = paramString;
    locall.field_local_flag &= -2;
    c(locall);
    AppMethodBeat.o(37869);
  }

  public final l YX(String paramString)
  {
    AppMethodBeat.i(37870);
    l locall1 = new l();
    l locall2 = locall1;
    if (this.rfd != null)
    {
      locall2 = locall1;
      if (this.rfc)
      {
        locall2 = this.rfd.XW(paramString);
        if (locall2 != null)
          AppMethodBeat.o(37870);
      }
    }
    while (true)
    {
      return locall2;
      locall2 = new l();
      locall2.field_userName = paramString;
      super.b(locall2, new String[] { this.xDe.xDc });
      AppMethodBeat.o(37870);
    }
  }

  public final boolean a(l paraml)
  {
    AppMethodBeat.i(37863);
    boolean bool;
    if ((this.rfc) && (this.rfd != null))
    {
      bool = this.rfd.a(paraml);
      if (this.rfd != null)
        this.rfd.cnU();
      AppMethodBeat.o(37863);
    }
    while (true)
    {
      return bool;
      bool = super.a(paraml);
      AppMethodBeat.o(37863);
    }
  }

  public final boolean a(String paramString, ccl paramccl)
  {
    AppMethodBeat.i(37872);
    l locall = YX(paramString);
    paramString = i.jV(paramccl.gva);
    if ((!bo.isNullOrNil(paramccl.guZ)) && ((locall.field_bgUrl == null) || (!locall.field_bgId.equals(paramString))))
    {
      locall.field_older_bgId = locall.field_bgId;
      locall.field_local_flag |= 1;
      locall.cqI();
      ab.d("MicroMsg.SnsExtStorage", "bg change");
    }
    locall.field_bgId = paramString;
    locall.field_bgUrl = paramccl.guZ;
    locall.field_iFlag = paramccl.guY;
    locall.field_snsBgId = paramccl.gva;
    locall.field_local_flag |= 4;
    if ((paramccl.xbQ & 0x1000) == 0)
    {
      if ((paramccl.xbQ & 0x200) <= 0)
        break label175;
      paramccl.xbQ |= 4096;
      paramccl.xbR = 4320;
    }
    while (true)
    {
      locall.a(paramccl);
      a(locall);
      AppMethodBeat.o(37872);
      return true;
      label175: if ((paramccl.xbQ & 0x400) > 0)
      {
        paramccl.xbQ |= 4096;
        paramccl.xbR = 72;
      }
    }
  }

  public final boolean a(String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    AppMethodBeat.i(37878);
    paramString = YX(paramString);
    int i = paramString.field_iFlag;
    if (paramString.cqK() != null);
    for (int j = paramString.cqK().xbQ; ; j = 0)
    {
      int k = -1;
      i |= 4096;
      int m = j | 0x1000;
      j = k;
      if (paramBoolean1)
        j = 4320;
      if (paramBoolean2)
        j = 72;
      if (paramBoolean4)
        j = 720;
      while (true)
      {
        if (paramBoolean3)
          i |= 2048;
        for (k = m | 0x800; ; k = m & 0xFFFFF7FF)
        {
          paramString.field_iFlag = i;
          ccl localccl = paramString.cqK();
          if (localccl != null)
          {
            localccl.xbQ = k;
            localccl.xbR = j;
            paramString.a(localccl);
          }
          c(paramString);
          AppMethodBeat.o(37878);
          return true;
          i &= -2049;
        }
      }
    }
  }

  public final ccl b(String paramString, ccl paramccl)
  {
    AppMethodBeat.i(37873);
    l locall = YX(paramString);
    if (locall == null)
    {
      paramString = a(paramString, locall);
      if (paramString != null)
        if (paramccl.guY != -1)
          break label55;
      label55: for (i = paramString.field_iFlag; ; i = paramccl.guY)
      {
        paramccl.guY = i;
        AppMethodBeat.o(37873);
        return paramccl;
      }
    }
    String str;
    label80: label97: int j;
    if (bo.isNullOrNil(paramccl.guZ))
    {
      str = locall.field_bgUrl;
      paramccl.guZ = str;
      if (paramccl.guY != -1)
        break label160;
      i = 1;
      if (i == 0)
        break label166;
      j = locall.field_iFlag;
      label108: paramccl.guY = j;
      paramString = a(paramString, locall);
      if (paramString != null)
        if (i == 0)
          break label175;
    }
    label160: label166: label175: for (int i = paramString.field_iFlag; ; i = paramccl.guY)
    {
      paramccl.guY = i;
      AppMethodBeat.o(37873);
      break;
      str = paramccl.guZ;
      break label80;
      i = 0;
      break label97;
      j = paramccl.guY;
      break label108;
    }
  }

  public final ccl b(String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    AppMethodBeat.i(37879);
    paramString = YX(paramString).cqK();
    if (paramString == null)
    {
      ab.e("MicroMsg.SnsExtStorage", "userinfo is null");
      paramString = null;
      AppMethodBeat.o(37879);
      return paramString;
    }
    int i = paramString.xbQ;
    int j = -1;
    i |= 4096;
    if (paramBoolean1)
      j = 4320;
    if (paramBoolean2)
      j = 72;
    if (paramBoolean4)
      j = 720;
    while (true)
    {
      if (paramBoolean3)
        i |= 2048;
      while (true)
      {
        paramString.xbQ = i;
        paramString.xbR = j;
        AppMethodBeat.o(37879);
        break;
        i &= -2049;
      }
    }
  }

  public final boolean b(l paraml)
  {
    AppMethodBeat.i(37862);
    boolean bool = super.a(paraml);
    AppMethodBeat.o(37862);
    return bool;
  }

  public final boolean bh(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(37876);
    paramString = YX(paramString);
    int i = paramString.field_iFlag;
    if (paramBoolean)
      i |= 1;
    while (true)
    {
      paramString.field_iFlag = i;
      c(paramString);
      AppMethodBeat.o(37876);
      return true;
      i &= -2;
    }
  }

  public final ccl bi(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(37877);
    paramString = YX(paramString).cqK();
    if (paramString == null)
    {
      ab.e("MicroMsg.SnsExtStorage", "userinfo is null");
      paramString = null;
      AppMethodBeat.o(37877);
      return paramString;
    }
    int i = paramString.xbQ;
    if (paramBoolean)
      i |= 1;
    while (true)
    {
      paramString.xbQ = i;
      AppMethodBeat.o(37877);
      break;
      i &= -2;
    }
  }

  public final boolean c(l paraml)
  {
    AppMethodBeat.i(37871);
    boolean bool;
    if ((paraml == null) || (paraml.field_userName == null) || (paraml.field_userName.equals("")))
    {
      bool = false;
      AppMethodBeat.o(37871);
    }
    while (true)
    {
      return bool;
      bool = super.a(paraml);
      AppMethodBeat.o(37871);
    }
  }

  public final void cmk()
  {
    AppMethodBeat.i(37859);
    ab.d("MicroMsg.SnsExtStorage", "attachCache");
    this.rfc = true;
    AppMethodBeat.o(37859);
  }

  public final void cml()
  {
    AppMethodBeat.i(37860);
    this.rfc = false;
    this.rfd.cnV();
    ab.d("MicroMsg.SnsExtStorage", "detchCache");
    AppMethodBeat.o(37860);
  }

  public final boolean gq(String paramString1, String paramString2)
  {
    AppMethodBeat.i(37867);
    paramString1 = YX(paramString1);
    paramString1.field_newerIds = paramString2;
    boolean bool = super.a(paramString1);
    AppMethodBeat.o(37867);
    return bool;
  }

  public final int h(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(37866);
    paramString1 = YX(paramString1);
    paramString1.field_md5 = paramString2;
    paramString1.field_adsession = paramArrayOfByte;
    super.a(paramString1);
    AppMethodBeat.o(37866);
    return 0;
  }

  public final int k(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(37865);
    paramString1 = YX(paramString1);
    paramString1.field_md5 = paramString2;
    paramString1.field_lastFirstPageRequestErrType = paramInt1;
    paramString1.field_lastFirstPageRequestErrCode = paramInt2;
    super.a(paramString1);
    AppMethodBeat.o(37865);
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.m
 * JD-Core Version:    0.6.2
 */