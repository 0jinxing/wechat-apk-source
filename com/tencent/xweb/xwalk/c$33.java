package com.tencent.xweb.xwalk;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.AsyncTask;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$33 extends AsyncTask<Void, Void, Boolean>
{
  private ProgressDialog nBv = null;

  c$33(c paramc, String paramString)
  {
  }

  protected final void onPreExecute()
  {
    AppMethodBeat.i(85161);
    this.nBv = new ProgressDialog(this.ARk.AMr);
    this.nBv.setProgressStyle(0);
    this.nBv.setMessage("安装中");
    this.nBv.setCancelable(false);
    this.nBv.setCanceledOnTouchOutside(false);
    this.nBv.setButton(-2, "取消", new c.33.1(this));
    this.nBv.setButton(-1, "重启", new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AppMethodBeat.i(85160);
        c.33.this.ARk.aAe();
        AppMethodBeat.o(85160);
      }
    });
    this.nBv.show();
    this.nBv.getButton(-2).setVisibility(8);
    this.nBv.getButton(-1).setVisibility(8);
    AppMethodBeat.o(85161);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.33
 * JD-Core Version:    0.6.2
 */