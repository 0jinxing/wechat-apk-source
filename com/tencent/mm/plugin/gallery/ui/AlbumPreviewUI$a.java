package com.tencent.mm.plugin.gallery.ui;

import android.app.ProgressDialog;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.GridView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

final class AlbumPreviewUI$a
  implements Runnable
{
  public WeakReference<a> mPW;
  public WeakReference<ProgressDialog> mPX;
  public WeakReference<TextView> mPY;
  public WeakReference<GridView> mPZ;
  public LinkedList<GalleryItem.MediaItem> mQa;
  public WeakReference<String> mQb;

  public final void run()
  {
    AppMethodBeat.i(21415);
    int i;
    if (this.mQa == null)
    {
      i = -1;
      ab.d("MicroMsg.AlbumPreviewUI", "on NotifyMediaItemsChanged, size %d", new Object[] { Integer.valueOf(i) });
      if (this.mPW != null)
        break label65;
      ab.w("MicroMsg.AlbumPreviewUI", "null == adapterRef");
      AppMethodBeat.o(21415);
    }
    while (true)
    {
      return;
      i = this.mQa.size();
      break;
      label65: Object localObject1 = (a)this.mPW.get();
      if (localObject1 == null)
      {
        ab.w("MicroMsg.AlbumPreviewUI", "null == adapter");
        AppMethodBeat.o(21415);
      }
      else
      {
        AlbumPreviewUI.W(this.mQa);
        Object localObject2 = this.mQa;
        if (((a)localObject1).mOO)
        {
          ((a)localObject1).mOO = false;
          ((a)localObject1).mOH.clear();
        }
        ((a)localObject1).mOH.addAll((Collection)localObject2);
        ((a)localObject1).notifyDataSetChanged();
        if (this.mPX == null)
        {
          AppMethodBeat.o(21415);
        }
        else
        {
          localObject2 = (ProgressDialog)this.mPX.get();
          if ((localObject2 != null) && (((ProgressDialog)localObject2).isShowing()))
          {
            ((ProgressDialog)localObject2).dismiss();
            ab.i("MicroMsg.AlbumPreviewUI", "[NotifyMediaItemsChanged] cost:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - AlbumPreviewUI.start) });
          }
          if ((this.mPY == null) || (this.mPZ == null) || (this.mQb == null))
          {
            AppMethodBeat.o(21415);
          }
          else
          {
            final TextView localTextView = (TextView)this.mPY.get();
            GridView localGridView = (GridView)this.mPZ.get();
            localObject2 = (String)this.mQb.get();
            if ((localTextView != null) && (localGridView != null) && (localObject2 != null))
            {
              localObject1 = ((a)localObject1).wt(localGridView.getFirstVisiblePosition());
              if ((!bo.isNullOrNil((String)localObject1)) && (((String)localObject1).equals("album_business_bubble_media_by_coordinate")))
              {
                localTextView.setVisibility(0);
                localTextView.setText((String)localObject2 + "附近的照片和视频");
                localTextView.postDelayed(new Runnable()
                {
                  public final void run()
                  {
                    AppMethodBeat.i(21414);
                    if (8 == localTextView.getVisibility())
                      AppMethodBeat.o(21414);
                    while (true)
                    {
                      return;
                      AlphaAnimation localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
                      localAlphaAnimation.setDuration(300L);
                      localTextView.clearAnimation();
                      localTextView.startAnimation(localAlphaAnimation);
                      localTextView.setVisibility(8);
                      AppMethodBeat.o(21414);
                    }
                  }
                }
                , 2000L);
              }
            }
            AppMethodBeat.o(21415);
          }
        }
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(21416);
    String str = super.toString() + "|notifyRunnable";
    AppMethodBeat.o(21416);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.a
 * JD-Core Version:    0.6.2
 */