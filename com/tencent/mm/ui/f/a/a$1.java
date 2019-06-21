package com.tencent.mm.ui.f.a;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

public final class a$1
  implements Runnable
{
  public a$1(a parama, String paramString1, Bundle paramBundle, String paramString2, a.a parama1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(80293);
    try
    {
      String str = this.zxw.zxr.a(this.zxs, this.val$parameters, this.zxt);
      this.zxu.wo(str);
      AppMethodBeat.o(80293);
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      while (true)
      {
        this.zxu.a(localFileNotFoundException);
        AppMethodBeat.o(80293);
      }
    }
    catch (MalformedURLException localMalformedURLException)
    {
      while (true)
      {
        this.zxu.a(localMalformedURLException);
        AppMethodBeat.o(80293);
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        this.zxu.b(localIOException);
        AppMethodBeat.o(80293);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.f.a.a.1
 * JD-Core Version:    0.6.2
 */