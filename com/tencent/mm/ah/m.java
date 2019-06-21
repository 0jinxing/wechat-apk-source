package com.tencent.mm.ah;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Looper;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.h.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.h;
import junit.framework.Assert;

public final class m
  implements f
{
  private Context context;
  private ProgressDialog fsh;
  private Runnable fsi;
  private Runnable fsj;
  private String path;

  public m(Context paramContext, String paramString)
  {
    AppMethodBeat.i(77946);
    this.fsi = null;
    this.fsj = null;
    this.context = paramContext;
    this.path = paramString;
    this.fsh = null;
    g.Rg().a(157, this);
    AppMethodBeat.o(77946);
  }

  public final boolean a(Runnable paramRunnable1, Runnable paramRunnable2)
  {
    AppMethodBeat.i(77948);
    if ((this.context != null) && (this.path != null) && (this.path.length() > 0));
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      this.fsi = paramRunnable1;
      this.fsj = paramRunnable2;
      paramRunnable1 = new l(this.path);
      g.Rg().a(paramRunnable1, 0);
      ab.i("MicroMsg.ProcessUploadHDHeadImg", "post is null ? %B", new Object[] { Boolean.FALSE });
      AppMethodBeat.o(77948);
      return true;
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(77949);
    ab.i("MicroMsg.ProcessUploadHDHeadImg", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    g.Rg().b(157, this);
    if ((this.fsh != null) && (this.fsh.isShowing()) && ((this.context instanceof Activity)) && (!((Activity)this.context).isFinishing()));
    try
    {
      this.fsh.dismiss();
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        Toast.makeText(this.context, 2131303334, 0).show();
        if (this.fsi != null)
          new ak(Looper.getMainLooper()).post(this.fsi);
        AppMethodBeat.o(77949);
        return;
      }
    }
    catch (IllegalArgumentException paramm)
    {
      while (true)
      {
        ab.e("MicroMsg.ProcessUploadHDHeadImg", "dismiss dialog err" + paramm.getMessage());
        continue;
        if (this.fsj != null)
          new ak(Looper.getMainLooper()).post(this.fsj);
        if ((paramString != null) && (paramString.length() > 0))
        {
          paramString = a.jY(paramString);
          if (paramString != null)
          {
            paramString.a(this.context, null, null);
            AppMethodBeat.o(77949);
          }
        }
        else if ((paramInt1 == 4) && (paramInt2 == -4))
        {
          Toast.makeText(this.context, 2131298601, 0).show();
          AppMethodBeat.o(77949);
        }
        else
        {
          Toast.makeText(this.context, 2131303333, 0).show();
          AppMethodBeat.o(77949);
        }
      }
    }
  }

  public final boolean w(Runnable paramRunnable)
  {
    AppMethodBeat.i(77947);
    if ((this.context != null) && (this.path != null) && (this.path.length() > 0))
    {
      bool = true;
      Assert.assertTrue(bool);
      this.fsi = paramRunnable;
      Object localObject = this.context;
      this.context.getString(2131297061);
      this.fsh = h.b((Context)localObject, this.context.getString(2131303335), true, null);
      localObject = new l(this.path);
      g.Rg().a((com.tencent.mm.ai.m)localObject, 0);
      if (paramRunnable != null)
        break label131;
    }
    label131: for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.ProcessUploadHDHeadImg", "post is null ? %B", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(77947);
      return true;
      bool = false;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.m
 * JD-Core Version:    0.6.2
 */