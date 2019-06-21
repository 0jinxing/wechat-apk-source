package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import a.f;
import a.f.a.a;
import a.f.b.j;
import a.f.b.r;
import a.f.b.v;
import a.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.chi;
import com.tencent.mm.sdk.platformtools.as;
import java.io.File;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"TAG", "", "TMPL_CONTROL_FLAG", "", "getTMPL_CONTROL_FLAG", "()J", "TMPL_CONTROL_FLAG$delegate", "Lkotlin/Lazy;", "kvTmpl", "Lcom/tencent/mm/sdk/platformtools/MultiProcessMMKV;", "getKvTmpl", "()Lcom/tencent/mm/sdk/platformtools/MultiProcessMMKV;", "basePath", "Lcom/tencent/mm/protocal/protobuf/TmplInfo;", "getBasePath", "(Lcom/tencent/mm/protocal/protobuf/TmplInfo;)Ljava/lang/String;", "indexPath", "getIndexPath", "isFileExists", "", "(Ljava/lang/String;)Z", "isLatestVerifiedExpired", "(Lcom/tencent/mm/protocal/protobuf/TmplInfo;)Z", "isValid", "isZip", "keyLatestResp", "", "getKeyLatestResp", "(I)Ljava/lang/String;", "keyLatestVerified", "getKeyLatestVerified", "keyLatestVerifiedMD5", "getKeyLatestVerifiedMD5", "keyLatestVerifiedTime", "getKeyLatestVerifiedTime", "keyStore", "getKeyStore", "keyVersions", "getKeyVersions", "getRelaunchState", "pidMM", "startMM", "pidMP", "startMP", "toFile", "Ljava/io/File;", "plugin-brandservice_release"})
public final class l
{
  private static final String TAG = "MicroMsg.TmplInfoEx";
  private static final f jTy;

  static
  {
    AppMethodBeat.i(14955);
    eQB = new a.i.k[] { (a.i.k)v.a(new r(v.f(l.class, "plugin-brandservice_release"), "TMPL_CONTROL_FLAG", "getTMPL_CONTROL_FLAG()J")) };
    TAG = "MicroMsg.TmplInfoEx";
    jTy = g.g((a)l.a.jTz);
    AppMethodBeat.o(14955);
  }

  public static final File FR(String paramString)
  {
    AppMethodBeat.i(14958);
    j.p(paramString, "receiver$0");
    paramString = new File(paramString);
    AppMethodBeat.o(14958);
    return paramString;
  }

  public static final boolean FS(String paramString)
  {
    AppMethodBeat.i(14959);
    j.p(paramString, "receiver$0");
    boolean bool = FR(paramString).exists();
    AppMethodBeat.o(14959);
    return bool;
  }

  public static final int a(int paramInt1, long paramLong1, int paramInt2, long paramLong2)
  {
    int i = 0;
    AppMethodBeat.i(14970);
    paramInt1 = (paramInt1 + '-' + paramLong1).hashCode();
    if (aXy().getInt("_tmpl_lastest_mm_open", 0) == paramInt1)
    {
      paramInt1 = (paramInt2 + '-' + paramLong2).hashCode();
      if (aXy().getInt("_tmpl_lastest_mp_open", 0) == paramInt1)
      {
        paramInt1 = 2;
        AppMethodBeat.o(14970);
      }
    }
    while (true)
    {
      return paramInt1;
      aXy().putInt("_tmpl_lastest_mp_open", paramInt1);
      paramInt1 = 1;
      AppMethodBeat.o(14970);
      continue;
      aXy().putInt("_tmpl_lastest_mm_open", paramInt1);
      AppMethodBeat.o(14970);
      paramInt1 = i;
    }
  }

  public static final boolean a(chi paramchi)
  {
    AppMethodBeat.i(14960);
    j.p(paramchi, "receiver$0");
    boolean bool;
    if (paramchi.Version != 0)
    {
      bool = true;
      AppMethodBeat.o(14960);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(14960);
    }
  }

  public static final long aXx()
  {
    AppMethodBeat.i(14956);
    long l = ((Number)jTy.getValue()).longValue();
    AppMethodBeat.o(14956);
    return l;
  }

  public static final as aXy()
  {
    AppMethodBeat.i(14957);
    as localas = as.eg("_webview_tmpl_info", 2);
    j.o(localas, "MultiProcessMMKV.getMMKV… MMKV.MULTI_PROCESS_MODE)");
    AppMethodBeat.o(14957);
    return localas;
  }

  public static final String b(chi paramchi)
  {
    AppMethodBeat.i(14961);
    j.p(paramchi, "receiver$0");
    int i = paramchi.jCt;
    Object localObject = paramchi.wld;
    j.o(localObject, "this.Uid");
    String str = k.q(i, (String)localObject, "");
    localObject = str;
    if (!FS(str))
    {
      i = paramchi.jCt;
      paramchi = paramchi.wld;
      j.o(paramchi, "this.Uid");
      localObject = k.ak(i, paramchi);
    }
    AppMethodBeat.o(14961);
    return localObject;
  }

  public static final String c(chi paramchi)
  {
    AppMethodBeat.i(14962);
    j.p(paramchi, "receiver$0");
    int i = paramchi.jCt;
    Object localObject = paramchi.wld;
    j.o(localObject, "this.Uid");
    String str = k.al(i, (String)localObject);
    localObject = str;
    if (!FS(str))
    {
      i = paramchi.jCt;
      paramchi = paramchi.wld;
      j.o(paramchi, "this.Uid");
      localObject = k.ak(i, paramchi);
    }
    AppMethodBeat.o(14962);
    return localObject;
  }

  public static final boolean d(chi paramchi)
  {
    AppMethodBeat.i(14963);
    j.p(paramchi, "receiver$0");
    String str = c(paramchi);
    int i = paramchi.jCt;
    paramchi = paramchi.wld;
    j.o(paramchi, "this.Uid");
    boolean bool = j.j(str, k.al(i, paramchi));
    AppMethodBeat.o(14963);
    return bool;
  }

  public static final String e(chi paramchi)
  {
    AppMethodBeat.i(14965);
    j.p(paramchi, "receiver$0");
    paramchi = "_tmpl_info_-" + paramchi.jCt + '-' + paramchi.wld;
    AppMethodBeat.o(14965);
    return paramchi;
  }

  public static final String f(chi paramchi)
  {
    AppMethodBeat.i(14966);
    j.p(paramchi, "receiver$0");
    paramchi = "_tmpl_info_latest_verified_-" + paramchi.jCt + '-' + paramchi.xgf;
    AppMethodBeat.o(14966);
    return paramchi;
  }

  public static final String g(chi paramchi)
  {
    AppMethodBeat.i(14967);
    j.p(paramchi, "receiver$0");
    paramchi = "_tmpl_info_latest_verified_time_-" + paramchi.jCt + '-' + paramchi.xgf;
    AppMethodBeat.o(14967);
    return paramchi;
  }

  public static final String h(chi paramchi)
  {
    AppMethodBeat.i(14968);
    j.p(paramchi, "receiver$0");
    paramchi = "_tmpl_info_version_list_-" + paramchi.jCt + '-' + paramchi.xgf;
    AppMethodBeat.o(14968);
    return paramchi;
  }

  public static final boolean i(chi paramchi)
  {
    AppMethodBeat.i(14969);
    j.p(paramchi, "receiver$0");
    boolean bool = d.C(aXy().getLong(g(paramchi), 0L), 3600000L);
    AppMethodBeat.o(14969);
    return bool;
  }

  public static final String ss(int paramInt)
  {
    AppMethodBeat.i(14964);
    String str = "_tmpl_info_latest_responsed_-".concat(String.valueOf(paramInt));
    AppMethodBeat.o(14964);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.l
 * JD-Core Version:    0.6.2
 */