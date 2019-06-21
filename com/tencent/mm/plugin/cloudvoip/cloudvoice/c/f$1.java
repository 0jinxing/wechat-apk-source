package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import android.os.Looper;
import android.os.Process;
import android.util.SparseArray;
import com.tencent.mars.xlog.Xlog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.cloudvoip.cloudvoice.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.wxmm.IConfCallBack;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

final class f$1
  implements IConfCallBack
{
  f$1(f paramf)
  {
  }

  public final byte[] callBackFromConf(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(135481);
    ab.i("MicroMsg.OpenVoice.OpenVoiceNativeCallbackMgr", "hy: triggered native callback: %d, %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    HashSet localHashSet = (HashSet)this.kzH.kzG.get(paramInt1);
    Object localObject;
    if ((localHashSet != null) && (localHashSet.size() > 0))
    {
      ArrayList localArrayList = new ArrayList(1);
      localObject = new byte[1];
      Iterator localIterator = localHashSet.iterator();
      while (localIterator.hasNext())
      {
        f.a locala = (f.a)localIterator.next();
        if (locala != null)
        {
          byte[] arrayOfByte = locala.bP(locala.i(paramInt2, locala.az(paramArrayOfByte)));
          localObject = arrayOfByte;
          if (!locala.bgp())
          {
            localArrayList.add(locala);
            localObject = arrayOfByte;
          }
        }
        else
        {
          ab.e("MicroMsg.OpenVoice.OpenVoiceNativeCallbackMgr", "hy: item is null! weired");
        }
      }
      paramArrayOfByte = localArrayList.iterator();
      while (paramArrayOfByte.hasNext())
        localHashSet.remove((f.a)paramArrayOfByte.next());
      AppMethodBeat.o(135481);
    }
    while (true)
    {
      return localObject;
      ab.w("MicroMsg.OpenVoice.OpenVoiceNativeCallbackMgr", "hy: nobody's listening to event %d, what a pity!", new Object[] { Integer.valueOf(paramInt1) });
      localObject = new byte[1];
      AppMethodBeat.o(135481);
    }
  }

  public final void callbackWriteLog(int paramInt1, String paramString1, String paramString2, int paramInt2, String paramString3, String paramString4, int paramInt3)
  {
    AppMethodBeat.i(135482);
    if (paramInt1 >= b.bgo())
      Xlog.logWrite2(paramInt1, "CloudVoIPNative:".concat(String.valueOf(paramString1)), paramString2, paramString3, Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramString4);
    AppMethodBeat.o(135482);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.f.1
 * JD-Core Version:    0.6.2
 */