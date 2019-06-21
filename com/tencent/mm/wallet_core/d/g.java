package com.tencent.mm.wallet_core.d;

import android.content.Intent;
import com.tencent.mm.ai.m;
import com.tencent.mm.ui.MMActivity;

public abstract class g
{
  public i Agm;
  public MMActivity hwd;

  public g(MMActivity paramMMActivity, i parami)
  {
    this.hwd = paramMMActivity;
    this.Agm = parami;
  }

  public CharSequence Au(int paramInt)
  {
    return null;
  }

  public abstract boolean c(int paramInt1, int paramInt2, String paramString, m paramm);

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }

  public abstract boolean p(Object[] paramArrayOfObject);

  public boolean w(Object[] paramArrayOfObject)
  {
    return false;
  }

  public boolean x(Object[] paramArrayOfObject)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.d.g
 * JD-Core Version:    0.6.2
 */