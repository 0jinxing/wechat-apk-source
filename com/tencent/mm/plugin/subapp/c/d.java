package com.tencent.mm.plugin.subapp.c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.RingtoneManager;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.uf;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.m.f;
import com.tencent.mm.model.an;
import com.tencent.mm.model.ao.d;
import com.tencent.mm.model.ao.f;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bw;
import com.tencent.mm.platformtools.t.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.e.i;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@SuppressLint({"UseSparseArrays"})
public class d
  implements ao.f, at
{
  private static HashMap<Integer, h.d> jZD;
  private static d ssR;
  private String eJM;
  private final Set<ao.d> epg;
  private t.a jZF;
  private k ssQ;
  private j ssS;
  private List<Long> ssT;
  private com.tencent.mm.sdk.b.c ssU;
  private com.tencent.mm.sdk.b.c ssV;
  private com.tencent.mm.sdk.b.c ssW;

  static
  {
    AppMethodBeat.i(25280);
    HashMap localHashMap = new HashMap();
    jZD = localHashMap;
    localHashMap.put(Integer.valueOf("VOICEREMIND_TABLE".hashCode()), new d.2());
    AppMethodBeat.o(25280);
  }

  public d()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 77	java/lang/Object:<init>	()V
    //   4: sipush 25267
    //   7: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_0
    //   11: new 79	java/util/ArrayList
    //   14: dup
    //   15: invokespecial 80	java/util/ArrayList:<init>	()V
    //   18: putfield 82	com/tencent/mm/plugin/subapp/c/d:ssT	Ljava/util/List;
    //   21: aload_0
    //   22: new 84	java/util/HashSet
    //   25: dup
    //   26: invokespecial 85	java/util/HashSet:<init>	()V
    //   29: putfield 87	com/tencent/mm/plugin/subapp/c/d:epg	Ljava/util/Set;
    //   32: aload_0
    //   33: new 10	com/tencent/mm/plugin/subapp/c/d$3
    //   36: dup
    //   37: aload_0
    //   38: invokespecial 90	com/tencent/mm/plugin/subapp/c/d$3:<init>	(Lcom/tencent/mm/plugin/subapp/c/d;)V
    //   41: putfield 92	com/tencent/mm/plugin/subapp/c/d:ssU	Lcom/tencent/mm/sdk/b/c;
    //   44: aload_0
    //   45: new 94	com/tencent/mm/plugin/subapp/c/d$4
    //   48: dup
    //   49: aload_0
    //   50: invokespecial 95	com/tencent/mm/plugin/subapp/c/d$4:<init>	(Lcom/tencent/mm/plugin/subapp/c/d;)V
    //   53: putfield 97	com/tencent/mm/plugin/subapp/c/d:ssV	Lcom/tencent/mm/sdk/b/c;
    //   56: aload_0
    //   57: new 99	com/tencent/mm/plugin/subapp/c/d$5
    //   60: dup
    //   61: aload_0
    //   62: invokespecial 100	com/tencent/mm/plugin/subapp/c/d$5:<init>	(Lcom/tencent/mm/plugin/subapp/c/d;)V
    //   65: putfield 102	com/tencent/mm/plugin/subapp/c/d:ssW	Lcom/tencent/mm/sdk/b/c;
    //   68: sipush 25267
    //   71: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   74: return
  }

  public static d cDD()
  {
    AppMethodBeat.i(25274);
    aw.ZE();
    com.tencent.mm.plugin.subapp.a locala = (com.tencent.mm.plugin.subapp.a)bw.oJ("plugin.subapp");
    if (locala == null);
    for (d locald = null; ; locald = (d)locala.abh(d.class.getName()))
    {
      ssR = locald;
      ab.i("MicroMsg.SubCoreVoiceRemind", "summervoice SubCoreVoiceRemind getCore subCoreSubapp[%s], theCore[%s], stack[%s]", new Object[] { locala, ssR, bo.dpG() });
      if (ssR == null)
      {
        locald = new d();
        ssR = locald;
        com.tencent.mm.model.ao.a.flx = locald;
        locala.b(d.class.getName(), ssR);
      }
      locald = ssR;
      AppMethodBeat.o(25274);
      return locald;
    }
  }

  public static k cDE()
  {
    AppMethodBeat.i(25275);
    com.tencent.mm.kernel.g.RN().QU();
    if (cDD().ssQ == null)
    {
      localObject1 = cDD();
      cDD();
      if (cDD().jZF == null)
      {
        Object localObject2 = new StringBuilder();
        aw.ZK();
        localObject2 = com.tencent.mm.model.c.Rt() + "CommonOneMicroMsg.db";
        cDD().jZF = com.tencent.mm.platformtools.t.a(d.class.hashCode(), (String)localObject2, jZD, false);
      }
      ((d)localObject1).ssQ = new k(cDD().jZF);
    }
    Object localObject1 = cDD().ssQ;
    AppMethodBeat.o(25275);
    return localObject1;
  }

  public static j cDF()
  {
    AppMethodBeat.i(25279);
    com.tencent.mm.kernel.g.RN().QU();
    if (cDD().ssS == null)
      cDD().ssS = new j();
    j localj = cDD().ssS;
    AppMethodBeat.o(25279);
    return localj;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void Zw()
  {
    AppMethodBeat.i(25272);
    cDF().run();
    AppMethodBeat.o(25272);
  }

  public final void a(ao.d paramd)
  {
    AppMethodBeat.i(25268);
    ab.d("MicroMsg.SubCoreVoiceRemind", "addVoiceRemind ");
    if (paramd != null)
      this.epg.add(paramd);
    AppMethodBeat.o(25268);
  }

  public final void b(ao.d paramd)
  {
    AppMethodBeat.i(25269);
    ab.d("MicroMsg.SubCoreVoiceRemind", "removeVoiceRemind ");
    if (paramd != null)
      this.epg.remove(paramd);
    AppMethodBeat.o(25269);
  }

  public final void bA(boolean paramBoolean)
  {
    AppMethodBeat.i(25277);
    aw.ZK();
    Object localObject = com.tencent.mm.model.c.getAccPath();
    if ((bo.isNullOrNil((String)localObject)) || (bo.isNullOrNil(this.eJM)) || (!((String)localObject).equals(this.eJM)))
    {
      ab.d("MicroMsg.SubCoreVoiceRemind", "setVoiceRemindPath core on accPath : ".concat(String.valueOf(localObject)));
      this.eJM = ((String)localObject);
      localObject = new File((String)localObject);
      if (!((File)localObject).exists())
        ((File)localObject).mkdirs();
      aw.ZK();
      localObject = new File(com.tencent.mm.model.c.Yh());
      if (!((File)localObject).exists())
        ((File)localObject).mkdirs();
    }
    AppMethodBeat.o(25277);
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(25276);
    StringBuilder localStringBuilder = new StringBuilder();
    aw.ZK();
    localStringBuilder.append(com.tencent.mm.model.c.Rt()).append("CommonOneMicroMsg.db");
    cDE();
    com.tencent.mm.sdk.b.a.xxA.c(this.ssU);
    com.tencent.mm.sdk.b.a.xxA.c(this.ssV);
    com.tencent.mm.sdk.b.a.xxA.c(this.ssW);
    ab.d("MicroMsg.SubCoreVoiceRemind", "summervoiceremind onAccountPostReset hash[%d]", new Object[] { Integer.valueOf(hashCode()) });
    AppMethodBeat.o(25276);
  }

  public final boolean fl(long paramLong)
  {
    AppMethodBeat.i(25273);
    boolean bool = this.ssT.contains(Long.valueOf(paramLong));
    ab.d("MicroMsg.SubCoreVoiceRemind", "silent " + bool + "  mid " + paramLong);
    AppMethodBeat.o(25273);
    return bool;
  }

  public final void iy(int paramInt)
  {
  }

  public final void l(String paramString1, String paramString2, long paramLong)
  {
    AppMethodBeat.i(25270);
    Context localContext = ah.getContext();
    if (localContext == null)
    {
      ab.d("MicroMsg.SubCoreVoiceRemind", "notifyVoiceRemind context null");
      AppMethodBeat.o(25270);
      return;
    }
    label501: 
    while (true)
    {
      try
      {
        boolean bool1 = f.MI();
        boolean bool2 = f.MG();
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("shake ");
        ab.d("MicroMsg.SubCoreVoiceRemind", bool1 + "sound " + bool2);
        if (com.tencent.mm.model.t.nw(aw.getNotification().IG()))
        {
          if (bool1)
            bo.z(localContext, true);
          if ((this.epg != null) && (this.epg.size() != 0))
            continue;
          RemindDialog.y(localContext, paramString1, paramString2);
          AppMethodBeat.o(25270);
          break;
        }
        if (bool1)
          bo.z(localContext, true);
        if (!bool2)
          continue;
        localObject = f.MK();
        if (localObject == e.i.evO)
        {
          localObject = RingtoneManager.getDefaultUri(2);
          localk = new com/tencent/mm/compatible/b/k;
          localk.<init>();
          try
          {
            localk.setDataSource(localContext, (Uri)localObject);
            localObject = new com/tencent/mm/plugin/subapp/c/d$1;
            ((d.1)localObject).<init>(this);
            localk.setOnCompletionListener((MediaPlayer.OnCompletionListener)localObject);
            if (aw.ZL().getStreamVolume(5) == 0)
              continue;
            if (!aw.ZL().KV())
              continue;
            int i = aw.ZL().getStreamVolume(8);
            int j = aw.ZL().getStreamMaxVolume(8);
            int k = aw.ZL().getStreamVolume(5);
            if (k <= j)
              break label501;
            k = j;
            aw.ZL().bR(8, k);
            localk.setAudioStreamType(8);
            localk.setLooping(true);
            localk.prepare();
            localk.setLooping(false);
            localk.start();
            aw.ZL().bR(8, i);
            ab.d("MicroMsg.SubCoreVoiceRemind", "oldVolume is %d, toneVolume is %d", new Object[] { Integer.valueOf(i), Integer.valueOf(k) });
          }
          catch (Exception localException1)
          {
            ab.printErrStackTrace("MicroMsg.SubCoreVoiceRemind", localException1, "", new Object[0]);
            try
            {
              localk.release();
            }
            catch (Throwable localThrowable)
            {
              ab.printErrStackTrace("MicroMsg.SubCoreVoiceRemind", localThrowable, "relese error", new Object[0]);
            }
          }
          continue;
        }
      }
      catch (Exception localException2)
      {
        com.tencent.mm.compatible.b.k localk;
        ab.printErrStackTrace("MicroMsg.SubCoreVoiceRemind", localException2, "", new Object[0]);
        continue;
        Uri localUri = Uri.parse(localException2);
        continue;
        localk.setAudioStreamType(5);
        localk.setLooping(true);
        localk.prepare();
        localk.setLooping(false);
        localk.start();
        continue;
        paramString1 = this.epg.iterator();
        if (paramString1.hasNext())
        {
          ((ao.d)paramString1.next()).p(paramString2, paramLong);
          continue;
        }
        AppMethodBeat.o(25270);
      }
      break;
    }
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(25278);
    if (this.ssS != null)
      this.ssS.cqV = 0;
    if (ssR != null)
    {
      ab.d("MicroMsg.SubCoreVoiceRemind", "SubCoreVoiceRemind close db");
      d locald = ssR;
      if (locald.jZF != null)
      {
        locald.jZF.mJ(locald.hashCode());
        locald.jZF = null;
      }
      locald.eJM = "";
    }
    com.tencent.mm.sdk.b.a.xxA.d(this.ssU);
    com.tencent.mm.sdk.b.a.xxA.d(this.ssV);
    com.tencent.mm.sdk.b.a.xxA.d(this.ssW);
    AppMethodBeat.o(25278);
  }

  public final void ot(String paramString)
  {
    AppMethodBeat.i(25271);
    aw.ZK();
    com.tencent.mm.model.c.XR().apb(paramString);
    this.ssT.clear();
    aw.ZK();
    Cursor localCursor = com.tencent.mm.model.c.XO().Rk(paramString);
    localCursor.moveToFirst();
    ab.d("MicroMsg.SubCoreVoiceRemind", "resetSilentQuene");
    while (!localCursor.isAfterLast())
    {
      bi localbi = new bi();
      localbi.d(localCursor);
      long l = localbi.field_msgId;
      ab.d("MicroMsg.SubCoreVoiceRemind", "resetSilentQuene: msgId = " + l + " status = " + localbi.field_status);
      localCursor.moveToNext();
      this.ssT.add(Long.valueOf(l));
    }
    localCursor.close();
    aw.ZK();
    com.tencent.mm.model.c.XO().Ri(paramString);
    AppMethodBeat.o(25271);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.c.d
 * JD-Core Version:    0.6.2
 */