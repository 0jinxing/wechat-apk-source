package com.tencent.mm.plugin.qqmail.ui;

import android.content.Intent;
import android.widget.ImageView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.b.v;
import com.tencent.mm.plugin.qqmail.stub.QQMailStubProxyUI;
import com.tencent.mm.plugin.qqmail.stub.ReadMailProxy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.ui.widget.MMWebView;

final class ReadMailUI$a$3
  implements Runnable
{
  ReadMailUI$a$3(ReadMailUI.a parama, int paramInt, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(68441);
    if (this.pAj.pzZ.isFinishing())
      AppMethodBeat.o(68441);
    while (true)
    {
      return;
      switch (this.pAj.pAh)
      {
      default:
        ab.e("MicroMsg.ReadMailUI", "onError invalid userData = %d", new Object[] { Integer.valueOf(this.pAj.pAh) });
        AppMethodBeat.o(68441);
        break;
      case 1:
        ReadMailUI.j(this.pAj.pzZ).setVisibility(0);
        Object localObject;
        if (this.crd == -5)
        {
          localObject = new Intent(this.pAj.pzZ, QQMailStubProxyUI.class);
          ((Intent)localObject).addFlags(268435456);
          this.pAj.pzZ.startActivityForResult((Intent)localObject, 1);
          AppMethodBeat.o(68441);
        }
        else
        {
          if (this.crd == -7)
            ReadMailUI.j(this.pAj.pzZ).setVisibility(8);
          try
          {
            localObject = new com/tencent/mm/plugin/qqmail/stub/ReadMailProxy;
            ((ReadMailProxy)localObject).<init>(ReadMailUI.l(this.pAj.pzZ), null);
            ((ReadMailProxy)localObject).REMOTE_CALL("replaceMsgContent", new Object[] { Long.valueOf(ReadMailUI.k(this.pAj.pzZ)), this.hWg });
            if ((this.crd == -10005) && (!at.isConnected(this.pAj.pzZ)))
              Toast.makeText(this.pAj.pzZ, this.pAj.pzZ.getString(2131299946, new Object[] { Integer.valueOf(2), Integer.valueOf(this.crd) }), 1).show();
            ReadMailUI.g(this.pAj.pzZ).loadDataWithBaseURL(v.ccw(), this.hWg + "(" + this.crd + ")", "text/html", "utf-8", null);
            AppMethodBeat.o(68441);
          }
          catch (Exception localException)
          {
            while (true)
              ab.w("MicroMsg.ReadMailUI", "replaceMsgContent fail, ex = %s", new Object[] { localException.getMessage() });
          }
        }
        break;
      case 2:
        if (this.crd == -5)
        {
          Intent localIntent = new Intent(this.pAj.pzZ, QQMailStubProxyUI.class);
          localIntent.addFlags(268435456);
          this.pAj.pzZ.startActivityForResult(localIntent, 2);
          AppMethodBeat.o(68441);
        }
        else
        {
          Toast.makeText(this.pAj.pzZ, this.hWg, 1).show();
          AppMethodBeat.o(68441);
        }
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ReadMailUI.a.3
 * JD-Core Version:    0.6.2
 */