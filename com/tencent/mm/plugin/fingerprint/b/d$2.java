package com.tencent.mm.plugin.fingerprint.b;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.plugin.fingerprint.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;

final class d$2
  implements Runnable
{
  d$2(d paramd, ak paramak)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(41439);
    if (!e.bxH());
    try
    {
      this.mry.dP(ah.getContext());
      if (e.bxI());
    }
    catch (Exception localException1)
    {
      try
      {
        ClassLoader localClassLoader = a.class.getClassLoader();
        if (!TextUtils.isEmpty(k.ky("teec")))
        {
          ab.i("MicroMsg.FingerPrintMgrImpl", "LoadLibrary fingerprintauth.so, find the libteec so");
          k.a("fingerprintauth", localClassLoader);
          e.hu(true);
        }
        while (true)
        {
          this.mrz.post(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(41438);
              try
              {
                d.bxq();
                AppMethodBeat.o(41438);
                return;
              }
              catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
              {
                while (true)
                {
                  ab.e("MicroMsg.FingerPrintMgrImpl", "can not LoadLibrary fingerprintauth.so e:=" + localUnsatisfiedLinkError.getMessage());
                  AppMethodBeat.o(41438);
                }
              }
              catch (Exception localException)
              {
                while (true)
                {
                  ab.printErrStackTrace("MicroMsg.FingerPrintMgrImpl", localException, "", new Object[0]);
                  ab.e("MicroMsg.FingerPrintMgrImpl", "init rsa key is occur exception e=" + localException.getMessage());
                  AppMethodBeat.o(41438);
                }
              }
            }
          });
          AppMethodBeat.o(41439);
          return;
          localException1 = localException1;
          ab.printErrStackTrace("MicroMsg.FingerPrintMgrImpl", localException1, "", new Object[0]);
          ab.e("MicroMsg.FingerPrintMgrImpl", "init wechat ta secure world is occur exception e=" + localException1.getMessage());
          e.ht(false);
          break;
          ab.e("MicroMsg.FingerPrintMgrImpl", "can not LoadLibrary fingerprintauth.so, because can not find the libteec");
          e.hu(false);
        }
      }
      catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
      {
        while (true)
        {
          ab.e("MicroMsg.FingerPrintMgrImpl", "can not LoadLibrary fingerprintauth.so e:=" + localUnsatisfiedLinkError.getMessage());
          e.hu(false);
        }
      }
      catch (Exception localException2)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.FingerPrintMgrImpl", localException2, "", new Object[0]);
          ab.e("MicroMsg.FingerPrintMgrImpl", "init rsa key is occur exception e=" + localException2.getMessage());
          e.hu(false);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.b.d.2
 * JD-Core Version:    0.6.2
 */