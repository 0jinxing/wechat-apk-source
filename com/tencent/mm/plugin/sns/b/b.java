package com.tencent.mm.plugin.sns.b;

import android.content.Context;
import android.os.Bundle;
import com.tencent.mm.kernel.b.a;
import com.tencent.mm.ui.MMFragment;

public abstract interface b extends a
{
  public abstract String getAccSnsPath();

  public abstract String getAccSnsTmpPath();

  public abstract MMFragment instantiateAlbumFragment(Context paramContext, Bundle paramBundle);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.b.b
 * JD-Core Version:    0.6.2
 */