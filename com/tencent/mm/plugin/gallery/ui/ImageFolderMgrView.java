package com.tencent.mm.plugin.gallery.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.model.GalleryItem.AlbumItem;
import com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem;
import com.tencent.mm.plugin.gallery.model.e;
import com.tencent.mm.plugin.gallery.model.g;
import com.tencent.mm.plugin.gallery.model.i.a;
import com.tencent.mm.plugin.gallery.model.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public class ImageFolderMgrView extends LinearLayout
  implements AdapterView.OnItemClickListener, i.a
{
  boolean aej;
  FrameLayout mQA;
  private View mQB;
  private ListView mQC;
  private b mQD;
  boolean mQE;
  private a mQz;

  public ImageFolderMgrView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(21477);
    this.mQz = null;
    this.aej = false;
    this.mQE = false;
    setOrientation(1);
    this.mQA = new FrameLayout(getContext());
    paramContext = new LinearLayout.LayoutParams(-1, -1);
    this.mQA.setVisibility(8);
    addView(this.mQA, paramContext);
    this.mQB = new View(getContext());
    this.mQB.setBackgroundColor(-872415232);
    this.mQB.setOnClickListener(new ImageFolderMgrView.3(this));
    paramContext = new FrameLayout.LayoutParams(-1, -1);
    this.mQA.addView(this.mQB, paramContext);
    this.mQC = new ListView(getContext());
    this.mQC.setCacheColorHint(0);
    this.mQC.setBackgroundResource(2131690304);
    this.mQC.setSelector(2130839563);
    this.mQC.setOnItemClickListener(this);
    int i = getResources().getDimensionPixelSize(2131427812);
    this.mQC.setPadding(i, i / 3, i, i * 2 / 3);
    paramContext = new FrameLayout.LayoutParams(-1, -2);
    paramContext.topMargin = getResources().getDimensionPixelSize(2131427563);
    paramContext.gravity = 80;
    this.mQA.addView(this.mQC, paramContext);
    this.mQD = new b(getContext(), e.bBZ().mOu);
    this.mQC.setAdapter(this.mQD);
    AppMethodBeat.o(21477);
  }

  private void bCF()
  {
    AppMethodBeat.i(21480);
    this.mQE = true;
    Animation localAnimation = AnimationUtils.loadAnimation(getContext(), 2131034227);
    localAnimation.setAnimationListener(new ImageFolderMgrView.1(this));
    this.mQC.startAnimation(localAnimation);
    localAnimation = AnimationUtils.loadAnimation(getContext(), 2131034181);
    this.mQB.startAnimation(localAnimation);
    AppMethodBeat.o(21480);
  }

  private void bCG()
  {
    AppMethodBeat.i(21481);
    this.mQE = true;
    this.mQA.setVisibility(0);
    Animation localAnimation = AnimationUtils.loadAnimation(getContext(), 2131034180);
    this.mQB.startAnimation(localAnimation);
    localAnimation = AnimationUtils.loadAnimation(getContext(), 2131034229);
    localAnimation.setAnimationListener(new ImageFolderMgrView.2(this));
    this.mQC.startAnimation(localAnimation);
    AppMethodBeat.o(21481);
  }

  private void hE(boolean paramBoolean)
  {
    AppMethodBeat.i(21479);
    if (this.aej == paramBoolean)
    {
      ab.d("MicroMsg.ImageFolderMgrView", "want to expand, but same status, expanded %B", new Object[] { Boolean.valueOf(this.aej) });
      AppMethodBeat.o(21479);
    }
    while (true)
    {
      return;
      if (this.mQE)
      {
        ab.d("MicroMsg.ImageFolderMgrView", "want to expand[%B], but now in animation", new Object[] { Boolean.valueOf(paramBoolean) });
        AppMethodBeat.o(21479);
      }
      else if (this.aej)
      {
        bCF();
        AppMethodBeat.o(21479);
      }
      else
      {
        bCG();
        AppMethodBeat.o(21479);
      }
    }
  }

  public final void V(LinkedList<GalleryItem.AlbumItem> paramLinkedList)
  {
    AppMethodBeat.i(21482);
    b localb = this.mQD;
    localb.mQe = paramLinkedList;
    if ((localb.mQe != null) && (!localb.mQe.isEmpty()) && (((GalleryItem.AlbumItem)localb.mQe.get(0)).mOh != null))
    {
      Iterator localIterator = localb.mQe.iterator();
      paramLinkedList = null;
      while (localIterator.hasNext())
      {
        GalleryItem.AlbumItem localAlbumItem = (GalleryItem.AlbumItem)localIterator.next();
        if (paramLinkedList == null)
        {
          paramLinkedList = localAlbumItem;
        }
        else
        {
          if (paramLinkedList.mOh.mOl >= localAlbumItem.mOh.mOl)
            break label151;
          paramLinkedList = localAlbumItem;
        }
      }
    }
    label151: 
    while (true)
    {
      break;
      if (paramLinkedList != null)
        localb.mQf.mOh = paramLinkedList.mOh;
      e.bCa().d(new ImageFolderMgrView.4(this));
      AppMethodBeat.o(21482);
      return;
    }
  }

  public final void bCE()
  {
    AppMethodBeat.i(21478);
    if (!this.aej);
    for (boolean bool = true; ; bool = false)
    {
      hE(bool);
      AppMethodBeat.o(21478);
      return;
    }
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(21483);
    paramAdapterView = this.mQD.ww(paramInt);
    if (paramAdapterView == null)
    {
      ab.d("MicroMsg.ImageFolderMgrView", "get folder failed:".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(21483);
    }
    while (true)
    {
      return;
      if (this.mQz != null)
        this.mQz.b(paramAdapterView);
      this.mQD.mQg = bo.bc(paramAdapterView.mOg, "");
      this.mQC.setSelection(0);
      this.mQD.notifyDataSetChanged();
      this.mQB.performClick();
      AppMethodBeat.o(21483);
    }
  }

  public void setListener(a parama)
  {
    this.mQz = parama;
  }

  public static abstract interface a
  {
    public abstract void b(GalleryItem.AlbumItem paramAlbumItem);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView
 * JD-Core Version:    0.6.2
 */