package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.wxmm.IConfCallBack;
import java.util.HashSet;

final class f
{
  private IConfCallBack kzF;
  final SparseArray<HashSet<f.a>> kzG;

  f()
  {
    AppMethodBeat.i(135483);
    this.kzF = null;
    this.kzG = new SparseArray(5);
    AppMethodBeat.o(135483);
  }

  final <ConvertedDataType, OutParamType> void a(int paramInt, f.a<ConvertedDataType, OutParamType> parama)
  {
    int i = 1;
    AppMethodBeat.i(135485);
    ab.i("MicroMsg.OpenVoice.OpenVoiceNativeCallbackMgr", "hy: registering event id: %d", new Object[] { Integer.valueOf(paramInt) });
    while (true)
    {
      try
      {
        HashSet localHashSet = (HashSet)this.kzG.get(paramInt);
        if (localHashSet == null)
        {
          localHashSet = new java/util/HashSet;
          localHashSet.<init>(1);
          localHashSet.add(parama);
          if (i != 0)
            this.kzG.append(paramInt, localHashSet);
          return;
        }
      }
      finally
      {
        AppMethodBeat.o(135485);
      }
      i = 0;
    }
  }

  final <ConvertedDataType, OutParamType> void b(int paramInt, f.a<ConvertedDataType, OutParamType> parama)
  {
    AppMethodBeat.i(135486);
    try
    {
      HashSet localHashSet = (HashSet)this.kzG.get(paramInt);
      if (localHashSet != null)
        localHashSet.remove(parama);
      return;
    }
    finally
    {
      AppMethodBeat.o(135486);
    }
    throw parama;
  }

  final IConfCallBack fT(boolean paramBoolean)
  {
    AppMethodBeat.i(135484);
    ab.i("MicroMsg.OpenVoice.OpenVoiceNativeCallbackMgr", "hy: trigger validate callback %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean);
    try
    {
      Object localObject1 = new com/tencent/mm/plugin/cloudvoip/cloudvoice/c/f$1;
      ((f.1)localObject1).<init>(this);
      for (this.kzF = ((IConfCallBack)localObject1); ; this.kzF = null)
      {
        this.kzG.clear();
        localObject1 = this.kzF;
        return localObject1;
      }
    }
    finally
    {
      AppMethodBeat.o(135484);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.f
 * JD-Core Version:    0.6.2
 */