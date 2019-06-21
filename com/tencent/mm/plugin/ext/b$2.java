package com.tencent.mm.plugin.ext;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.os.Build.VERSION;
import com.qq.wx.voice.embed.recognizer.Grammar;
import com.qq.wx.voice.embed.recognizer.b.a;
import com.qq.wx.voice.embed.recognizer.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bq;
import com.tencent.mm.storage.f;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

final class b$2
  implements Runnable
{
  b$2(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20261);
    Object localObject1;
    Object localObject2;
    long l;
    int j;
    try
    {
      localObject1 = g.Nu().getValue("VoiceRecognizeSprSoMD5");
      localObject2 = g.Nu().getValue("VoiceRecognizeSprDataMD5");
      if ((localObject1 == null) || (localObject2 == null))
      {
        ab.i("MicroMsg.SubCoreExt", "error mMd5So:%s,  mMd5Data:%s", new Object[] { localObject1, localObject2 });
        b.e(this.lPx);
        AppMethodBeat.o(20261);
        return;
      }
      Object localObject3 = "/system/lib/";
      if (Build.VERSION.SDK_INT >= 24)
        localObject3 = "/vendor/lib/";
      ab.i("MicroMsg.SubCoreExt", "mMd5So:%s,  mMd5Data:%s,  mSoPath:%s", new Object[] { localObject1, localObject2, localObject3 });
      l = System.currentTimeMillis();
      localObject4 = b.a.bCt;
      Object localObject5 = ah.getContext();
      localObject4 = ((com.qq.wx.voice.embed.recognizer.b)localObject4).bCs;
      if (((com.qq.wx.voice.embed.recognizer.e)localObject4).d)
        i = 0;
      while (true)
      {
        localObject3 = ah.doB();
        ab.i("MicroMsg.SubCoreExt", "checkFiles ret:%s,use time:%s", new Object[] { Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l) });
        if (i != 0)
          break label693;
        l = System.currentTimeMillis();
        localObject1 = new java/util/LinkedList;
        ((LinkedList)localObject1).<init>();
        ((List)localObject1).add("tmessage");
        ((List)localObject1).add("officialaccounts");
        ((List)localObject1).add("helper_entry");
        aw.ZK();
        localObject2 = c.XU().RA("@t.qq.com");
        if (localObject2 != null)
          ((List)localObject1).add(((bq)localObject2).name);
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        aw.ZK();
        localObject4 = c.XM().a("@all.contact.android", null, (List)localObject1, null, true, true);
        if (localObject4 != null)
          break label340;
        ab.w("MicroMsg.SubCoreExt", "initLocalVoiceControl cu is null");
        b.e(this.lPx);
        AppMethodBeat.o(20261);
        break;
        j = ((com.qq.wx.voice.embed.recognizer.e)localObject4).bCz.checkFiles((Context)localObject5, (String)localObject3, (String)localObject1, (String)localObject2);
        i = j;
        if (j >= 0)
        {
          ((com.qq.wx.voice.embed.recognizer.e)localObject4).d = true;
          i = 0;
        }
      }
      label340: if (((Cursor)localObject4).moveToFirst())
        while (!((Cursor)localObject4).isAfterLast())
        {
          localObject5 = new com/tencent/mm/storage/f;
          ((f)localObject5).<init>();
          ((f)localObject5).d((Cursor)localObject4);
          localObject1 = new com/qq/wx/voice/embed/recognizer/d;
          ((d)localObject1).<init>(((f)localObject5).field_username, ((f)localObject5).field_nickname, ((f)localObject5).field_conRemark);
          ((ArrayList)localObject2).add(localObject1);
          ((Cursor)localObject4).moveToNext();
        }
    }
    catch (Exception localException)
    {
      Object localObject4;
      while (true)
      {
        ab.i("MicroMsg.SubCoreExt", "initLocalVoiceControl Exception:%s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(20261);
      }
      ((Cursor)localObject4).close();
      ab.i("MicroMsg.SubCoreExt", "init cusor,count:%s,use time:%s", new Object[] { Integer.valueOf(((Cursor)localObject4).getCount()), Long.valueOf(System.currentTimeMillis() - l) });
      l = System.currentTimeMillis();
      localObject1 = b.a.bCt.bCs;
      if (((com.qq.wx.voice.embed.recognizer.e)localObject1).d)
        break label611;
    }
    int i = -304;
    label512: if (i == 0)
    {
      localException.edit().putBoolean("hasInitVoiceControlData", true).putBoolean("hasTryToInitVoiceControlData", true).commit();
      b.f(this.lPx);
      label554: ab.i("MicroMsg.SubCoreExt", "init ret:%s,use time:%s", new Object[] { Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l) });
      b.e(this.lPx);
    }
    while (true)
    {
      b.e(this.lPx);
      AppMethodBeat.o(20261);
      break;
      label611: if (((com.qq.wx.voice.embed.recognizer.e)localObject1).e)
      {
        j = ((com.qq.wx.voice.embed.recognizer.e)localObject1).bCz.update((ArrayList)localObject2);
        i = j;
        if (j < 0)
          break label512;
      }
      while (true)
      {
        i = 0;
        break;
        j = ((com.qq.wx.voice.embed.recognizer.e)localObject1).bCz.init((ArrayList)localObject2);
        i = j;
        if (j < 0)
          break;
        ((com.qq.wx.voice.embed.recognizer.e)localObject1).e = true;
      }
      localException.edit().putBoolean("hasInitVoiceControlData", false).commit();
      break label554;
      label693: localException.edit().putBoolean("hasInitVoiceControlData", false).putBoolean("hasTryToInitVoiceControlData", true).commit();
      b.f(this.lPx);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.b.2
 * JD-Core Version:    0.6.2
 */