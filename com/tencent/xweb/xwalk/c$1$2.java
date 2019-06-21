package com.tencent.xweb.xwalk;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Environment;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

final class c$1$2
  implements DialogInterface.OnClickListener
{
  c$1$2(c.1 param1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(85121);
    paramDialogInterface = this.ARl.ARk;
    Object localObject1 = new Date();
    Object localObject2 = new SimpleDateFormat("yyyy-MM-dd-HH_mm_ss");
    String str = Environment.getExternalStorageDirectory().getPath();
    str = str + "/xweb_dump/" + ((SimpleDateFormat)localObject2).format((Date)localObject1);
    localObject1 = str + "/main.html";
    localObject2 = str + "/resource";
    paramDialogInterface.ARb.savePage((String)localObject1, (String)localObject2, 1);
    new Thread(new c.40(paramDialogInterface, str)).start();
    AppMethodBeat.o(85121);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.1.2
 * JD-Core Version:    0.6.2
 */