package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import org.json.JSONObject;

public abstract class n extends o
  implements MMActivity.a
{
  protected MMActivity hwd;
  private int hwe;

  public n(m paramm, com.tencent.mm.plugin.appbrand.q paramq, u paramu, JSONObject paramJSONObject, int paramInt)
  {
    super(paramm, paramq, paramu, paramJSONObject, paramInt);
    paramq = paramq.getRuntime().asV();
    if (paramq == null)
      paramq = null;
    while (true)
    {
      this.hwd = paramq;
      if (this.hwd != null)
        break;
      throw new IllegalArgumentException("JsApiActivityResultRequest. Activity is null");
      paramq = paramq.getContext();
      if (!(paramq instanceof MMActivity))
        paramq = null;
      else
        paramq = (MMActivity)paramq;
    }
    this.hwe = (paramm.hashCode() & 0xFFFF);
  }

  protected abstract void C(Intent paramIntent);

  protected abstract boolean a(MMActivity paramMMActivity, JSONObject paramJSONObject, int paramInt);

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (this.hwe != paramInt1);
    while (true)
    {
      return;
      if (paramInt2 == -1)
        C(paramIntent);
      else if ((paramIntent != null) && (paramIntent.hasExtra("result_error_msg")))
        onError(paramIntent.getIntExtra("result_error_code", -1), paramIntent.getStringExtra("result_error_msg"));
      else
        onError(-1, "fail:system error {{unknow error}}");
    }
  }

  protected abstract void onError(int paramInt, String paramString);

  public final void run()
  {
    this.hwd.ifE = this;
    if (!a(this.hwd, aCg(), this.hwe))
      onError(-1, "fail:system error {{launch fail}}");
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.n
 * JD-Core Version:    0.6.2
 */