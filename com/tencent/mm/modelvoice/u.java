package com.tencent.mm.modelvoice;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;

public final class u extends k
{
  public static final String[] fnj = { "CREATE TABLE IF NOT EXISTS voiceinfo ( FileName TEXT PRIMARY KEY, User TEXT, MsgId INT, NetOffset INT, FileNowSize INT, TotalLen INT, Status INT, CreateTime INT, LastModifyTime INT, ClientId TEXT, VoiceLength INT, MsgLocalId INT, Human TEXT, reserved1 INT, reserved2 TEXT, MsgSource TEXT, MsgFlag INT, MsgSeq INT, MasterBufId INT, checksum INT DEFAULT 0 )", "CREATE INDEX IF NOT EXISTS voiceinfomsgidindex ON voiceinfo ( MsgId ) ", "CREATE UNIQUE INDEX IF NOT EXISTS voiceinfouniqueindex ON voiceinfo ( FileName )" };
  public com.tencent.mm.cd.h fni;
  Map<String, a> gav;
  Map<String, l> gaw;
  Map<String, h> gax;

  public u(com.tencent.mm.cd.h paramh)
  {
    AppMethodBeat.i(116663);
    this.gav = new HashMap();
    this.gaw = new HashMap();
    this.gax = new HashMap();
    b(paramh);
    this.fni = paramh;
    AppMethodBeat.o(116663);
  }

  private static void b(com.tencent.mm.cd.h paramh)
  {
    AppMethodBeat.i(116664);
    Cursor localCursor = paramh.a("PRAGMA table_info(voiceinfo)", null, 0);
    if (localCursor == null)
    {
      ab.i("MicroMsg.VoiceStorage", "addNewColIfNeed failed, cursor is null.");
      AppMethodBeat.o(116664);
      return;
    }
    int i = localCursor.getColumnIndex("name");
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    label54: String str;
    while (localCursor.moveToNext())
      if (i >= 0)
      {
        str = localCursor.getString(i);
        if ("MsgSource".equals(str))
          i1 = 1;
        if ("MsgFlag".equals(str))
          n = 1;
        if ("MsgSeq".equals(str))
          m = 1;
        if (!"MasterBufId".equals(str))
          break label226;
        k = 1;
      }
    label226: 
    while (true)
    {
      if ("checksum".equals(str))
        j = 1;
      break label54;
      localCursor.close();
      if (i1 == 0)
        paramh.hY("voiceinfo", "Alter table voiceinfo add MsgSource TEXT");
      if (n == 0)
        paramh.hY("voiceinfo", "Alter table voiceinfo add MsgFlag INT");
      if (m == 0)
        paramh.hY("voiceinfo", "Alter table voiceinfo add MsgSeq INT");
      if (k == 0)
        paramh.hY("voiceinfo", "Alter table voiceinfo add MasterBufId INT");
      if (j == 0)
        paramh.hY("voiceinfo", "Alter table voiceinfo add checksum INT DEFAULT 0");
      AppMethodBeat.o(116664);
      break;
    }
  }

  public static String uY(String paramString)
  {
    AppMethodBeat.i(116665);
    paramString = com.tencent.mm.model.p.m(paramString, bo.anU());
    AppMethodBeat.o(116665);
    return paramString;
  }

  public final boolean a(String paramString, p paramp)
  {
    boolean bool1 = true;
    AppMethodBeat.i(116668);
    if (paramString.length() > 0)
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      if (paramp == null)
        break label70;
      bool2 = true;
      label29: Assert.assertTrue(bool2);
      paramp = paramp.Hl();
      if (paramp.size() > 0)
        break label76;
      ab.e("MicroMsg.VoiceStorage", "update failed, no values set");
      label53: AppMethodBeat.o(116668);
    }
    for (boolean bool2 = false; ; bool2 = bool1)
    {
      return bool2;
      bool2 = false;
      break;
      label70: bool2 = false;
      break label29;
      label76: if (this.fni.update("voiceinfo", paramp, "FileName= ?", new String[] { paramString }) <= 0)
        break label53;
      doNotify();
      AppMethodBeat.o(116668);
    }
  }

  public final boolean b(p paramp)
  {
    boolean bool1 = true;
    AppMethodBeat.i(116666);
    if (paramp != null)
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      paramp = paramp.Hl();
      if (paramp.size() > 0)
        break label50;
      ab.e("MicroMsg.VoiceStorage", "insert falied, no values set");
      label36: AppMethodBeat.o(116666);
    }
    for (boolean bool2 = false; ; bool2 = bool1)
    {
      return bool2;
      bool2 = false;
      break;
      label50: if (this.fni.insert("voiceinfo", "FileName", paramp) == -1L)
        break label36;
      doNotify();
      AppMethodBeat.o(116666);
    }
  }

  public final p fZ(long paramLong)
  {
    p localp = null;
    AppMethodBeat.i(116669);
    Object localObject = "SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2, MsgSource, MsgFlag, MsgSeq, MasterBufId, checksum" + " FROM voiceinfo WHERE MsgId=" + paramLong;
    localObject = this.fni.a((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      localp = new p();
      localp.d((Cursor)localObject);
    }
    ((Cursor)localObject).close();
    AppMethodBeat.o(116669);
    return localp;
  }

  public final p mv(int paramInt)
  {
    p localp = null;
    AppMethodBeat.i(116670);
    Object localObject = "SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2, MsgSource, MsgFlag, MsgSeq, MasterBufId, checksum" + " FROM voiceinfo WHERE MsgLocalId=" + paramInt;
    localObject = this.fni.a((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      localp = new p();
      localp.d((Cursor)localObject);
    }
    ((Cursor)localObject).close();
    AppMethodBeat.o(116670);
    return localp;
  }

  public final boolean pI(String paramString)
  {
    AppMethodBeat.i(116667);
    if (paramString.length() > 0);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      if (this.fni.delete("voiceinfo", "FileName= ?", new String[] { paramString }) <= 0)
        ab.w("MicroMsg.VoiceStorage", "delete failed, no such file:".concat(String.valueOf(paramString)));
      AppMethodBeat.o(116667);
      return true;
    }
  }

  public final p uZ(String paramString)
  {
    AppMethodBeat.i(116671);
    Object localObject1 = null;
    Object localObject2 = "SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2, MsgSource, MsgFlag, MsgSeq, MasterBufId, checksum" + " FROM voiceinfo WHERE FileName= ?";
    localObject2 = this.fni.a((String)localObject2, new String[] { paramString }, 2);
    paramString = localObject1;
    if (((Cursor)localObject2).moveToFirst())
    {
      paramString = new p();
      paramString.d((Cursor)localObject2);
    }
    ((Cursor)localObject2).close();
    AppMethodBeat.o(116671);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.u
 * JD-Core Version:    0.6.2
 */