package com.tencent.mm.plugin.subapp;

import android.annotation.SuppressLint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.model.ao.f;
import com.tencent.mm.model.at;
import com.tencent.mm.pluginsdk.f.f.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.cc;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
  implements at
{
  static cc srD;
  private Map<String, at> srE;
  private a.a srF;
  private com.tencent.mm.plugin.subapp.d.a srG;
  private com.tencent.mm.plugin.subapp.d.c srH;

  public a()
  {
    AppMethodBeat.i(25171);
    this.srE = new HashMap();
    ab.i("MicroMsg.SubCoreSubapp", "SubCoreSubapp constructor: " + System.currentTimeMillis());
    ab.i("MicroMsg.SubCoreSubapp", "SubCoreSubapp getSubCoreMap: " + System.currentTimeMillis());
    HashMap localHashMap = new HashMap();
    localHashMap.put(com.tencent.mm.ar.d.class.getName(), new com.tencent.mm.ar.d());
    localHashMap.put(com.tencent.mm.plugin.subapp.b.c.class.getName(), new com.tencent.mm.plugin.subapp.b.c());
    localHashMap.put(com.tencent.mm.plugin.subapp.a.c.class.getName(), new com.tencent.mm.plugin.subapp.a.c());
    Object localObject = new com.tencent.mm.plugin.subapp.c.d();
    com.tencent.mm.model.ao.a.flx = (ao.f)localObject;
    localHashMap.put(com.tencent.mm.plugin.subapp.c.d.class.getName(), localObject);
    localObject = new com.tencent.mm.plugin.subapp.jdbiz.c();
    localHashMap.put(com.tencent.mm.plugin.subapp.jdbiz.c.class.getName(), localObject);
    com.tencent.mm.pluginsdk.f.f.vdy = (f.b)localObject;
    this.srE = localHashMap;
    AppMethodBeat.o(25171);
  }

  @SuppressLint({"UseSparseArrays"})
  public final HashMap<Integer, h.d> Jx()
  {
    AppMethodBeat.i(25172);
    ab.i("MicroMsg.SubCoreSubapp", "SubCoreSubapp getBaseDBFactories: " + System.currentTimeMillis());
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.srE.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (((at)localEntry.getValue()).Jx() != null)
        localHashMap.putAll(((at)localEntry.getValue()).Jx());
    }
    AppMethodBeat.o(25172);
    return localHashMap;
  }

  public final at abh(String paramString)
  {
    AppMethodBeat.i(25177);
    paramString = (at)this.srE.get(paramString);
    AppMethodBeat.o(25177);
    return paramString;
  }

  public final void b(String paramString, at paramat)
  {
    AppMethodBeat.i(25178);
    this.srE.put(paramString, paramat);
    AppMethodBeat.o(25178);
  }

  public final void bA(boolean paramBoolean)
  {
    AppMethodBeat.i(25175);
    ab.i("MicroMsg.SubCoreSubapp", "SubCoreSubapp onSdcardMount: " + System.currentTimeMillis());
    Iterator localIterator = this.srE.entrySet().iterator();
    while (localIterator.hasNext())
      ((at)((Map.Entry)localIterator.next()).getValue()).bA(paramBoolean);
    AppMethodBeat.o(25175);
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(25174);
    ab.i("MicroMsg.SubCoreSubapp", "SubCoreSubapp onAccountPostReset: " + System.currentTimeMillis());
    Iterator localIterator = this.srE.entrySet().iterator();
    while (localIterator.hasNext())
      ((at)((Map.Entry)localIterator.next()).getValue()).bz(paramBoolean);
    if (this.srF == null)
      this.srF = new a.a();
    if (this.srG == null)
      this.srG = new com.tencent.mm.plugin.subapp.d.a();
    if (this.srH == null)
      this.srH = new com.tencent.mm.plugin.subapp.d.c();
    com.tencent.mm.sdk.b.a.xxA.c(this.srF);
    com.tencent.mm.sdk.b.a.xxA.c(this.srH);
    com.tencent.mm.sdk.b.a.xxA.c(this.srG);
    AppMethodBeat.o(25174);
  }

  public final void iy(int paramInt)
  {
    AppMethodBeat.i(25173);
    ab.i("MicroMsg.SubCoreSubapp", "SubCoreSubapp clearPluginData: " + System.currentTimeMillis());
    Iterator localIterator = this.srE.entrySet().iterator();
    while (localIterator.hasNext())
      ((at)((Map.Entry)localIterator.next()).getValue()).iy(paramInt);
    AppMethodBeat.o(25173);
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(25176);
    ab.i("MicroMsg.SubCoreSubapp", "SubCoreSubapp onAccountRelease: " + System.currentTimeMillis());
    Iterator localIterator = this.srE.entrySet().iterator();
    while (localIterator.hasNext())
      ((at)((Map.Entry)localIterator.next()).getValue()).onAccountRelease();
    if (this.srF != null)
      com.tencent.mm.sdk.b.a.xxA.d(this.srF);
    if (this.srG != null)
      com.tencent.mm.sdk.b.a.xxA.d(this.srG);
    if (this.srH != null)
      com.tencent.mm.sdk.b.a.xxA.d(this.srH);
    AppMethodBeat.o(25176);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.a
 * JD-Core Version:    0.6.2
 */