package com.tencent.mm.plugin.normsg;

import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.bz;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.plugin.normsg.b.a.a;
import com.tencent.mm.plugin.normsg.b.a.c;
import com.tencent.mm.plugin.normsg.b.b.f;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

public class PluginNormsg extends com.tencent.mm.kernel.b.f
  implements com.tencent.mm.kernel.api.c, o, a
{
  private static final String oTI;
  private static final String oTJ;
  private static final String oTK;

  static
  {
    AppMethodBeat.i(10360);
    oTI = b.oTE.TQ("\034:/-9+\n.\"0:41\r\"!");
    oTJ = b.oTE.TQ("\005#64 2\004(,");
    oTK = b.oTE.TQ("");
    AppMethodBeat.o(10360);
  }

  private void processUpdateCCEncryptKey(Map<String, String> paramMap)
  {
    AppMethodBeat.i(10358);
    String str1 = (String)paramMap.get(b.oTE.TQ("k5>3,1$b\030>+)=/\016:6$. %\0316%s+-4"));
    if (bo.isNullOrNil(str1))
    {
      ab.e("MicroMsg.PluginNormsg", "uccek: cannot get required url.");
      AppMethodBeat.o(10358);
    }
    String str2;
    while (true)
    {
      return;
      str2 = Normsg.a.bVH();
      if (str2 != null);
      for (paramMap = new File(str2); ; paramMap = null)
      {
        if (paramMap != null)
          break label98;
        ab.e("MicroMsg.PluginNormsg", "uccek: failure to get required path.");
        h.pYm.k(876L, 0L, 1L);
        AppMethodBeat.o(10358);
        break;
      }
      label98: if (paramMap.exists())
        break;
      localFile = paramMap.getParentFile();
      if ((localFile.exists()) || (localFile.mkdirs()))
        break;
      ab.e("MicroMsg.PluginNormsg", "uccek: failure to create required path.");
      h.pYm.k(876L, 1L, 1L);
      AppMethodBeat.o(10358);
    }
    File localFile = new File(str2 + "_@tmp");
    if (localFile.exists())
      localFile.delete();
    while (true)
    {
      com.tencent.mm.i.g localg = new com.tencent.mm.i.g();
      localg.cRY = false;
      localg.egm = str1;
      localg.field_fileType = com.tencent.mm.i.a.efP;
      localg.field_fullpath = localFile.getAbsolutePath();
      localg.field_mediaId = str2;
      localg.allow_mobile_net_download = false;
      localg.egq = true;
      localg.is_resume_task = false;
      localg.field_autostart = true;
      localg.egn = ((int)TimeUnit.MINUTES.toSeconds(1L));
      localg.ego = ((int)TimeUnit.MINUTES.toSeconds(10L));
      localg.egl = new PluginNormsg.1(this, localFile, paramMap);
      com.tencent.mm.al.f.afx().b(localg, -1);
      AppMethodBeat.o(10358);
      break;
      localFile.getParentFile().mkdirs();
    }
  }

  private void processUpdateRqtSignKey(Map<String, String> paramMap, int paramInt)
  {
    AppMethodBeat.i(10359);
    String str1 = (String)paramMap.get(b.oTE.TQ("b<7:%8-k\0217\" 4&\020,(q++4"));
    if (bo.isNullOrNil(str1))
    {
      ab.e("MicroMsg.PluginNormsg", "uccek: cannot get required url.");
      AppMethodBeat.o(10359);
    }
    String str2;
    label104: Object localObject;
    while (true)
    {
      return;
      str2 = Normsg.a.Ai(paramInt);
      if (str2 != null);
      for (paramMap = new File(str2); ; paramMap = null)
      {
        if (paramMap != null)
          break label104;
        ab.e("MicroMsg.PluginNormsg", "urqtk: failure to get required path.");
        h.pYm.k(876L, 27L, 1L);
        AppMethodBeat.o(10359);
        break;
      }
      if (paramMap.exists())
        break;
      localObject = paramMap.getParentFile();
      if ((((File)localObject).exists()) || (((File)localObject).mkdirs()))
        break;
      ab.e("MicroMsg.PluginNormsg", "urqtk: failure to create required path.");
      h.pYm.k(876L, 28L, 1L);
      AppMethodBeat.o(10359);
    }
    File localFile = new File(str2 + "_@tmp");
    if (localFile.exists())
      localFile.delete();
    while (true)
    {
      localObject = new com.tencent.mm.i.g();
      ((com.tencent.mm.i.g)localObject).cRY = false;
      ((com.tencent.mm.i.g)localObject).egm = str1;
      ((com.tencent.mm.i.g)localObject).field_fileType = com.tencent.mm.i.a.efP;
      ((com.tencent.mm.i.g)localObject).field_fullpath = localFile.getAbsolutePath();
      ((com.tencent.mm.i.g)localObject).field_mediaId = str2;
      ((com.tencent.mm.i.g)localObject).allow_mobile_net_download = false;
      ((com.tencent.mm.i.g)localObject).egq = true;
      ((com.tencent.mm.i.g)localObject).is_resume_task = false;
      ((com.tencent.mm.i.g)localObject).field_autostart = true;
      ((com.tencent.mm.i.g)localObject).egn = ((int)TimeUnit.MINUTES.toSeconds(1L));
      ((com.tencent.mm.i.g)localObject).ego = ((int)TimeUnit.MINUTES.toSeconds(10L));
      ((com.tencent.mm.i.g)localObject).egl = new PluginNormsg.2(this, localFile, paramMap);
      com.tencent.mm.al.f.afx().b((com.tencent.mm.i.g)localObject, -1);
      AppMethodBeat.o(10359);
      break;
      localFile.getParentFile().mkdirs();
    }
  }

  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(10354);
    com.tencent.mm.plugin.normsg.a.b.a(b.oTE);
    AppMethodBeat.o(10354);
  }

  public void dependency()
  {
    AppMethodBeat.i(10353);
    dependsOn(com.tencent.mm.plugin.zero.a.d.class);
    dependsOn(com.tencent.mm.plugin.report.c.class);
    dependsOn(com.tencent.mm.plugin.comm.a.a.class);
    dependsOn(p.class);
    AppMethodBeat.o(10353);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
  }

  public void installed()
  {
    AppMethodBeat.i(10352);
    alias(a.class);
    AppMethodBeat.o(10352);
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(10355);
    paramc = com.tencent.mm.plugin.normsg.b.a.bVT();
    com.tencent.mm.kernel.b.g localg = com.tencent.mm.kernel.g.RM().Rn();
    if (!a.c.isEnabled())
      ab.w("MircoMsg.AEDHLP", "[tomys] aedh is not enabled.");
    while (true)
    {
      ((p)com.tencent.mm.kernel.g.M(p.class)).getSysCmdMsgExtension().a(oTI, this);
      AppMethodBeat.o(10355);
      return;
      int i = a.c.bWa();
      int j = i;
      if (i <= 0)
        j = 26;
      if (Build.VERSION.SDK_INT > j)
        ab.w("MircoMsg.AEDHLP", "[tomys] unsupported system, aedh is not enabled.");
      else if (com.tencent.mm.plugin.normsg.b.a.oTR.contains(com.tencent.mm.plugin.normsg.b.a.TS(localg.eHT)))
        try
        {
          com.tencent.mm.plugin.normsg.b.b localb = com.tencent.mm.plugin.normsg.b.b.bWc();
          localb.initialize(localg.cc);
          localb.ensureInitialized();
          localb.oUx.add(paramc);
          ab.i("MircoMsg.AEDHLP", "[tomys] aed installed.");
        }
        catch (b.f localf)
        {
          ab.printErrStackTrace("MircoMsg.AEDHLP", localf, "[tomys] aed install failed.", new Object[0]);
          paramc.j(localf);
        }
      else
        ab.w("MircoMsg.AEDHLP", "[tomys] not target process, skip installing aed.");
    }
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(10356);
    ((p)com.tencent.mm.kernel.g.M(p.class)).getSysCmdMsgExtension().b(oTI, this);
    AppMethodBeat.o(10356);
  }

  public void onNewXmlReceived(String paramString, Map<String, String> paramMap, e.a parama)
  {
    AppMethodBeat.i(10357);
    ab.i("MicroMsg.PluginNormsg", "xml cmd received, subType: %s", new Object[] { paramString });
    if (oTI.equals(paramString))
    {
      processUpdateCCEncryptKey(paramMap);
      AppMethodBeat.o(10357);
    }
    while (true)
    {
      return;
      if (oTJ.equals(paramString))
      {
        processUpdateRqtSignKey(paramMap, 0);
        AppMethodBeat.o(10357);
      }
      else
      {
        if (oTK.equals(paramString))
          processUpdateRqtSignKey(paramMap, 1);
        AppMethodBeat.o(10357);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.PluginNormsg
 * JD-Core Version:    0.6.2
 */