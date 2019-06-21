package com.tencent.mm.plugin.gallery.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.a.a;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem;
import com.tencent.mm.plugin.gallery.model.GalleryItem.VideoMediaItem;
import com.tencent.mm.plugin.gallery.model.e;
import com.tencent.mm.plugin.gallery.model.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

public final class f extends RecyclerView.a<f.a>
  implements View.OnClickListener
{
  private Context mContext;
  private ArrayList<String> mQW;
  private boolean mQm;
  c mRC;
  private int mRD;
  ArrayList<String> mRE;
  f.b mRF;
  private int mRG;
  private int mRH;
  private int mRI;
  private int mRJ;
  private Drawable mRK;
  a mRL;

  public f(Context paramContext, ArrayList<String> paramArrayList, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(21578);
    this.mRE = new ArrayList();
    this.mRG = -1;
    this.mRH = -1;
    this.mRL = new a(new f.1(this));
    this.mContext = paramContext;
    this.mQW = paramArrayList;
    this.mRE.addAll(paramArrayList);
    this.mRD = paramInt;
    this.mQm = paramBoolean;
    this.mRK = paramContext.getResources().getDrawable(2130838508);
    AppMethodBeat.o(21578);
  }

  private GalleryItem.MediaItem a(int paramInt, f.a parama)
  {
    AppMethodBeat.i(21586);
    if ((paramInt < 0) || (paramInt >= this.mRE.size()))
    {
      ab.w("MicroMsg.PreviewSelectedImageAdapter", "error position %d, imagePaths size %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.mRE.size()) });
      AppMethodBeat.o(21586);
      parama = null;
      return parama;
    }
    Object localObject1 = (String)this.mRE.get(paramInt);
    if (this.mQm)
    {
      if (this.mRC.mOH == null)
        break label327;
      localObject1 = GalleryItem.MediaItem.a(0, 0L, (String)localObject1, (String)localObject1, "");
      paramInt = this.mRC.mOH.indexOf(localObject1);
      if (paramInt >= 0)
      {
        parama.mRS = paramInt;
        parama = (GalleryItem.MediaItem)this.mRC.mOH.get(paramInt);
      }
    }
    while (true)
    {
      AppMethodBeat.o(21586);
      break;
      Object localObject2 = e.bCe().iterator();
      while (true)
        if (((Iterator)localObject2).hasNext())
        {
          parama = (GalleryItem.MediaItem)((Iterator)localObject2).next();
          if (parama.equals(localObject1))
          {
            ab.i("MicroMsg.PreviewSelectedImageAdapter", "[getMediaItem] %s", new Object[] { parama.fPT });
            break;
          }
        }
      parama = null;
      continue;
      if (e.bCb() != null)
      {
        localObject2 = GalleryItem.MediaItem.a(0, 0L, (String)localObject1, (String)localObject1, "");
        paramInt = e.bCb().indexOf(localObject2);
        if (paramInt >= 0)
        {
          parama = (GalleryItem.MediaItem)e.bCb().get(paramInt);
        }
        else
        {
          localObject1 = e.bCe().iterator();
          while (true)
            if (((Iterator)localObject1).hasNext())
            {
              parama = (GalleryItem.MediaItem)((Iterator)localObject1).next();
              if (parama.equals(localObject2))
              {
                ab.i("MicroMsg.PreviewSelectedImageAdapter", "[getMediaItem] %s", new Object[] { parama.fPT });
                break;
              }
            }
          parama = null;
        }
      }
      else
      {
        parama = GalleryItem.MediaItem.a(1, 0L, (String)localObject1, (String)localObject1, "");
        continue;
        label327: parama = null;
      }
    }
  }

  private void a(f.a parama, int paramInt)
  {
    AppMethodBeat.i(21582);
    GalleryItem.MediaItem localMediaItem = a(paramInt, parama);
    if (localMediaItem == null)
    {
      ab.e("MicroMsg.PreviewSelectedImageAdapter", "get item failed");
      AppMethodBeat.o(21582);
      return;
    }
    Object localObject = parama.mRR.getLayoutParams();
    int i = this.mRD;
    ((ViewGroup.LayoutParams)localObject).width = i;
    ((ViewGroup.LayoutParams)localObject).height = i;
    c(parama.mOW, localMediaItem.fPT, paramInt);
    parama.mRR.setOnClickListener(this);
    if (this.mQm)
    {
      parama.mRR.setTag(Integer.valueOf(parama.mRS));
      label102: if (localMediaItem.getType() != 2)
        break label243;
      parama.mOY.setVisibility(0);
      i = Math.round((float)((GalleryItem.VideoMediaItem)localMediaItem).fPW / 1000.0F);
      parama.mOZ.setText(String.format(Locale.CHINA, "%d:%02d", new Object[] { Integer.valueOf(i / 60), Integer.valueOf(i % 60) }));
    }
    String str;
    while (true)
    {
      localObject = localMediaItem.Wy();
      str = localMediaItem.fPT;
      if ((!bo.isNullOrNil((String)localObject)) || (!bo.isNullOrNil(str)))
        break label255;
      ab.e("MicroMsg.PreviewSelectedImageAdapter", "null or nil filepath: ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(21582);
      break;
      parama.mRR.setTag(localMediaItem.fPT);
      break label102;
      label243: parama.mOY.setVisibility(8);
    }
    label255: h.a(parama.mOX, localMediaItem.getType(), (String)localObject, str, localMediaItem.mOk, this.mRD, new f.2(this, parama));
    if (((e.bBZ().hOZ == 3) || (e.bBZ().hOZ == 11)) && (localMediaItem != null) && (localMediaItem.mMimeType.equalsIgnoreCase("image/gif")))
    {
      parama.mPc.setVisibility(0);
      label333: if (!localMediaItem.mMimeType.equalsIgnoreCase("edit"))
        break label384;
      parama.mPd.setVisibility(0);
    }
    while (true)
    {
      parama.mRQ.setVisibility(8);
      AppMethodBeat.o(21582);
      break;
      parama.mPc.setVisibility(8);
      break label333;
      label384: parama.mPd.setVisibility(8);
    }
  }

  private void c(ImageView paramImageView, String paramString, int paramInt)
  {
    AppMethodBeat.i(21583);
    int i;
    if (this.mQW.contains(paramString))
    {
      paramImageView.setBackground(null);
      paramImageView.setImageDrawable(this.mRK);
      i = 0;
      paramImageView.setVisibility(0);
      if ((bo.isNullOrNil(this.mRC.getItem(this.mRI))) || (!this.mRC.getItem(this.mRI).equals(paramString)))
        break label124;
      paramImageView.setVisibility(0);
      if ((i == 0) || (paramInt != this.mRJ))
        break label208;
      paramImageView.setImageDrawable(this.mRK);
      AppMethodBeat.o(21583);
    }
    label208: 
    while (true)
    {
      return;
      paramImageView.setBackgroundColor(-1090519041);
      paramImageView.setImageDrawable(null);
      i = 1;
      break;
      label124: if ((!bo.isNullOrNil(this.mRC.getItem(this.mRI))) && (!this.mRC.getItem(this.mRI).equals(paramString)))
      {
        if ((paramInt != this.mRJ) && (i == 0))
        {
          paramImageView.setVisibility(8);
          AppMethodBeat.o(21583);
        }
        else if ((paramInt == this.mRJ) && (i == 0))
        {
          paramImageView.setImageDrawable(this.mRK);
        }
      }
      else
        AppMethodBeat.o(21583);
    }
  }

  public final void addItem(String paramString)
  {
    AppMethodBeat.i(21579);
    this.mRE.add(paramString);
    AppMethodBeat.o(21579);
  }

  public final void el(int paramInt1, int paramInt2)
  {
    this.mRJ = paramInt1;
    this.mRI = paramInt2;
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(21584);
    int i = this.mRE.size();
    AppMethodBeat.o(21584);
    return i;
  }

  public final int indexOf(String paramString)
  {
    AppMethodBeat.i(21580);
    int i = this.mRE.indexOf(paramString);
    AppMethodBeat.o(21580);
    return i;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21585);
    if (this.mRF != null)
      if (this.mQm)
      {
        this.mRF.wC(((Integer)paramView.getTag()).intValue());
        AppMethodBeat.o(21585);
      }
    while (true)
    {
      return;
      this.mRF.wC(this.mRE.indexOf(paramView.getTag()));
      AppMethodBeat.o(21585);
    }
  }

  public final void remove(int paramInt)
  {
    AppMethodBeat.i(21581);
    this.mRE.remove(paramInt);
    AppMethodBeat.o(21581);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.f
 * JD-Core Version:    0.6.2
 */