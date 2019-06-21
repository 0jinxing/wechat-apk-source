package com.tencent.mm.plugin.luckymoney.ui;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.app.ActionBar;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

public class j
{
  public MMActivity knn;
  public int oic;
  private int oid;

  public j(MMActivity paramMMActivity)
  {
    AppMethodBeat.i(43045);
    this.knn = paramMMActivity;
    if (bMM())
    {
      paramMMActivity = paramMMActivity.getWindow();
      paramMMActivity.addFlags(-2147483648);
      this.oid = paramMMActivity.getStatusBarColor();
    }
    AppMethodBeat.o(43045);
  }

  public static boolean bMM()
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected void t(Drawable paramDrawable)
  {
    AppMethodBeat.i(43046);
    if (this.knn.getSupportActionBar() != null)
      this.knn.getSupportActionBar().setBackgroundDrawable(paramDrawable);
    AppMethodBeat.o(43046);
  }

  public static final class a
  {
    public int jlo;
    public Drawable oie;
    public int oif;
    public int oig;
    public int oih;
    public int oii;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.j
 * JD-Core Version:    0.6.2
 */