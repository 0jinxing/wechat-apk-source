package com.tencent.mm.plugin.wallet_index.ui;

import android.content.Intent;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;

public abstract interface b
{
  public abstract int a(MMActivity paramMMActivity, d paramd);

  public abstract void a(MMActivity paramMMActivity, ArrayList<String> paramArrayList, d paramd, boolean paramBoolean);

  public abstract boolean a(MMActivity paramMMActivity, int paramInt1, int paramInt2, Intent paramIntent);

  public abstract void b(MMActivity paramMMActivity, boolean paramBoolean);

  public abstract int cSW();

  public abstract void l(MMActivity paramMMActivity);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.ui.b
 * JD-Core Version:    0.6.2
 */