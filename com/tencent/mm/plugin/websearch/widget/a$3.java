package com.tencent.mm.plugin.websearch.widget;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.c;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.loader.j.b;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import java.io.File;
import java.io.IOException;

final class a$3
  implements Runnable
{
  a$3(a parama, String paramString, View paramView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(91393);
    try
    {
      Thread.sleep(500L);
      u.i("FTSSearchWidgetMgr", "saving widget preview", new Object[0]);
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      String str = b.eSk.replace("/data/user/0", "/data/data") + "/fts_cache";
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      Object localObject2 = new java/io/File;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      str = str + "/";
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("widget_frame_");
      ((File)localObject2).<init>(str, this.ucL + "_" + System.currentTimeMillis());
      localObject1 = ((File)localObject2).getAbsolutePath() + ".jpg";
      localObject2 = d.eA(this.val$view);
      if (localObject2 == null)
        AppMethodBeat.o(91393);
      while (true)
      {
        return;
        d.a((Bitmap)localObject2, 100, Bitmap.CompressFormat.JPEG, (String)localObject1, true);
        localObject2 = new android/os/Bundle;
        ((Bundle)localObject2).<init>();
        ((Bundle)localObject2).putString("widgetId", this.ucL);
        ((Bundle)localObject2).putString("path", (String)localObject1);
        localObject1 = new com/tencent/mm/plugin/websearch/widget/a$3$1;
        ((a.3.1)localObject1).<init>(this);
        f.a("com.tencent.mm", (Parcelable)localObject2, a.c.class, (c)localObject1);
        AppMethodBeat.o(91393);
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.printErrStackTrace("FTSSearchWidgetMgr", localIOException, "", new Object[0]);
        AppMethodBeat.o(91393);
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
      {
        ab.printErrStackTrace("FTSSearchWidgetMgr", localInterruptedException, "", new Object[0]);
        AppMethodBeat.o(91393);
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
      {
        ab.printErrStackTrace("FTSSearchWidgetMgr", localRuntimeException, "", new Object[0]);
        AppMethodBeat.o(91393);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.a.3
 * JD-Core Version:    0.6.2
 */