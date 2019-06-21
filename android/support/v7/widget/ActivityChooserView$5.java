package android.support.v7.widget;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

final class ActivityChooserView$5 extends DataSetObserver
{
  ActivityChooserView$5(ActivityChooserView paramActivityChooserView)
  {
  }

  public final void onChanged()
  {
    super.onChanged();
    ActivityChooserView localActivityChooserView = this.aeQ;
    if (localActivityChooserView.aeA.getCount() > 0)
    {
      localActivityChooserView.aeE.setEnabled(true);
      int i = localActivityChooserView.aeA.aeR.hg();
      int j = localActivityChooserView.aeA.aeR.getHistorySize();
      if ((i != 1) && ((i <= 1) || (j <= 0)))
        break label186;
      localActivityChooserView.aeG.setVisibility(0);
      ResolveInfo localResolveInfo = localActivityChooserView.aeA.aeR.hh();
      Object localObject = localActivityChooserView.getContext().getPackageManager();
      localActivityChooserView.aeH.setImageDrawable(localResolveInfo.loadIcon((PackageManager)localObject));
      if (localActivityChooserView.aeP != 0)
      {
        localObject = localResolveInfo.loadLabel((PackageManager)localObject);
        localObject = localActivityChooserView.getContext().getString(localActivityChooserView.aeP, new Object[] { localObject });
        localActivityChooserView.aeG.setContentDescription((CharSequence)localObject);
      }
      label153: if (localActivityChooserView.aeG.getVisibility() != 0)
        break label198;
      localActivityChooserView.aeC.setBackgroundDrawable(localActivityChooserView.aeD);
    }
    while (true)
    {
      return;
      localActivityChooserView.aeE.setEnabled(false);
      break;
      label186: localActivityChooserView.aeG.setVisibility(8);
      break label153;
      label198: localActivityChooserView.aeC.setBackgroundDrawable(null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ActivityChooserView.5
 * JD-Core Version:    0.6.2
 */