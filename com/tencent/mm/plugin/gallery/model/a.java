package com.tencent.mm.plugin.gallery.model;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Comparator;
import java.util.LinkedList;

public final class a extends b
  implements Comparator<GalleryItem.MediaItem>
{
  protected ContentResolver bpL;
  private volatile boolean eVT;
  private j mNo;
  private n mNp;

  public a()
  {
    AppMethodBeat.i(21218);
    this.eVT = false;
    this.bpL = ah.getContext().getContentResolver();
    this.mNo = new j();
    this.mNp = new n();
    AppMethodBeat.o(21218);
  }

  public final LinkedList<GalleryItem.MediaItem> a(String paramString, int paramInt, i.d paramd, long paramLong)
  {
    AppMethodBeat.i(21221);
    long l = System.currentTimeMillis();
    this.eVT = false;
    LinkedList localLinkedList = new LinkedList();
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Cursor localCursor1 = null;
    Cursor localCursor2 = null;
    Object localObject4;
    if (bo.isNullOrNil(paramString))
    {
      if (paramInt != 1)
      {
        localObject1 = localCursor1;
        if (paramInt != 3);
      }
      else
      {
        localObject2 = this.bpL.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, this.mNo.getProjection(), this.mNo.a(this.mNr, false), null, this.mNo.hB(false));
        localObject1 = this.bpL.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, this.mNo.getProjection(), this.mNo.a(this.mNr, true), null, this.mNo.hB(true));
      }
      if (paramInt != 2)
      {
        localObject4 = localObject1;
        localObject3 = localObject2;
        if (paramInt != 3)
          break label963;
      }
      localCursor2 = this.bpL.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, this.mNp.getProjection(), this.mNp.a(new String[] { this.mNr[0] }, false), null, this.mNp.hB(false));
      localCursor1 = this.bpL.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, this.mNp.getProjection(), this.mNp.a(new String[] { this.mNr[0] }, true), null, this.mNp.hB(true));
      localObject3 = localObject2;
      localObject2 = localObject1;
    }
    while (true)
    {
      if (localObject3 != null)
        localObject3.moveToFirst();
      if (localObject2 != null)
        ((Cursor)localObject2).moveToFirst();
      if (localCursor2 != null)
        localCursor2.moveToFirst();
      if (localCursor1 != null)
        localCursor1.moveToFirst();
      localObject1 = b(localObject3, 1);
      localObject4 = b((Cursor)localObject2, 1);
      Object localObject5 = b(localCursor2, 2);
      Object localObject6 = b(localCursor1, 2);
      Object localObject7;
      Object localObject8;
      Object localObject9;
      Object localObject10;
      Object localObject11;
      label517: 
      do
      {
        localObject7 = null;
        if (localObject1 != null)
          localObject7 = localObject1;
        localObject8 = localObject7;
        if (localObject4 != null)
          if (localObject7 != null)
          {
            localObject8 = localObject7;
            if (((GalleryItem.MediaItem)localObject7).mOl >= ((GalleryItem.MediaItem)localObject4).mOl);
          }
          else
          {
            localObject8 = localObject4;
          }
        localObject7 = localObject8;
        if (localObject5 != null)
          if (localObject8 != null)
          {
            localObject7 = localObject8;
            if (((GalleryItem.MediaItem)localObject8).mOl >= ((GalleryItem.MediaItem)localObject5).mOl);
          }
          else
          {
            localObject7 = localObject5;
          }
        localObject9 = localObject7;
        if (localObject6 != null)
          if (localObject7 != null)
          {
            localObject9 = localObject7;
            if (((GalleryItem.MediaItem)localObject7).mOl >= ((GalleryItem.MediaItem)localObject6).mOl);
          }
          else
          {
            localObject9 = localObject6;
          }
        if (localObject9 == null)
          break label891;
        localLinkedList.add(localObject9);
        if (localObject9 != localObject1)
          break;
        localObject3.moveToNext();
        localObject10 = b(localObject3, 1);
        localObject11 = localObject4;
        localObject7 = localObject5;
        localObject8 = localObject6;
        if (localLinkedList.size() + 1 % this.mNq == 0)
          paramd.c(localLinkedList, paramLong);
        localObject6 = localObject8;
        localObject5 = localObject7;
        localObject4 = localObject11;
        localObject1 = localObject10;
      }
      while (!this.eVT);
      AppMethodBeat.o(21221);
      while (true)
      {
        return localLinkedList;
        if (paramInt != 1)
        {
          localObject2 = localObject3;
          if (paramInt != 3);
        }
        else
        {
          localObject1 = this.bpL.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, this.mNo.getProjection(), this.mNo.aP(paramString, false), null, this.mNo.hB(false));
          localObject2 = this.bpL.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, this.mNo.getProjection(), this.mNo.aP(paramString, true), null, this.mNo.hB(true));
        }
        if (paramInt != 2)
        {
          localObject4 = localObject2;
          localObject3 = localObject1;
          if (paramInt != 3)
            break label963;
        }
        localCursor2 = this.bpL.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, this.mNp.getProjection(), this.mNp.aP(paramString, false), null, this.mNp.hB(false));
        localCursor1 = this.bpL.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, this.mNp.getProjection(), this.mNp.aP(paramString, true), null, this.mNp.hB(true));
        localObject3 = localObject1;
        break;
        if (localObject9 == localObject4)
        {
          ((Cursor)localObject2).moveToNext();
          localObject11 = b((Cursor)localObject2, 1);
          localObject8 = localObject6;
          localObject7 = localObject5;
          localObject10 = localObject1;
          break label517;
        }
        if (localObject9 == localObject5)
        {
          localCursor2.moveToNext();
          localObject7 = b(localCursor2, 2);
          localObject8 = localObject6;
          localObject11 = localObject4;
          localObject10 = localObject1;
          break label517;
        }
        localObject8 = localObject6;
        localObject7 = localObject5;
        localObject11 = localObject4;
        localObject10 = localObject1;
        if (localObject9 != localObject6)
          break label517;
        localCursor1.moveToNext();
        localObject8 = b(localCursor1, 2);
        localObject7 = localObject5;
        localObject11 = localObject4;
        localObject10 = localObject1;
        break label517;
        label891: paramd.c(localLinkedList, paramLong);
        ab.i("MicroMsg.AllMediaQuery", "[queryMediaItemsInAlbum] albumName:%s type:%s result size:%s ticket:%s cost:%s", new Object[] { paramString, Integer.valueOf(paramInt), Integer.valueOf(localLinkedList.size()), Long.valueOf(paramLong), Long.valueOf(System.currentTimeMillis() - l) });
        AppMethodBeat.o(21221);
      }
      label963: localCursor1 = null;
      localObject2 = localObject4;
    }
  }

  public final LinkedList<GalleryItem.AlbumItem> bBS()
  {
    Object localObject1 = null;
    AppMethodBeat.i(21220);
    LinkedList localLinkedList = new LinkedList();
    try
    {
      localCursor1 = this.bpL.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, this.mNp.bBU(), "0==0) GROUP BY (bucket_display_name", null, "max_time desc, _id desc");
      if (localCursor1 == null)
        ab.d("MicroMsg.AllMediaQuery", "no video folder now");
    }
    catch (Exception localException1)
    {
      try
      {
        while (true)
        {
          Cursor localCursor1 = this.bpL.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, this.mNo.bBU(), "0==0) GROUP BY (bucket_display_name", null, "max_time desc, _id desc");
          if (localCursor1 != null)
            break;
          ab.d("MicroMsg.AllMediaQuery", "no image folder now");
          AppMethodBeat.o(21220);
          return localLinkedList;
          localException1 = localException1;
          ab.e("MicroMsg.AllMediaQuery", "query video album list failed : [%s]", new Object[] { localException1.getMessage() });
          Cursor localCursor2 = null;
          continue;
          if (localCursor2.moveToFirst())
          {
            Object localObject3 = null;
            int i = 0;
            int j;
            do
            {
              GalleryItem.AlbumItem localAlbumItem = a(localCursor2, 2, "bucket_display_name");
              localObject4 = localObject3;
              j = i;
              if (localAlbumItem != null)
              {
                i += localAlbumItem.cyR;
                localObject4 = localObject3;
                j = i;
                if (localObject3 == null)
                {
                  localObject4 = localAlbumItem.mOh;
                  j = i;
                }
              }
              localObject3 = localObject4;
              i = j;
            }
            while (localCursor2.moveToNext());
            localObject3 = new GalleryItem.AlbumItem(ah.getContext().getString(2131300168), j);
            ((GalleryItem.AlbumItem)localObject3).mOh = ((GalleryItem.MediaItem)localObject4);
            localLinkedList.add(localObject3);
          }
          localCursor2.close();
        }
      }
      catch (Exception localException2)
      {
        while (true)
        {
          Object localObject4;
          ab.e("MicroMsg.AllMediaQuery", "query image album list failed : [%s]", new Object[] { localException2.getMessage() });
          Object localObject2 = localObject1;
          continue;
          if (localObject2.moveToFirst())
            do
            {
              localObject4 = a(localObject2, 1, "bucket_display_name");
              if (localObject4 != null)
                localLinkedList.add(localObject4);
            }
            while (localObject2.moveToNext());
          localObject2.close();
        }
      }
    }
  }

  public final void bBT()
  {
    this.eVT = true;
  }

  public final String hB(boolean paramBoolean)
  {
    AppMethodBeat.i(21219);
    String str;
    if (paramBoolean)
    {
      str = b.mNt + " desc, _id desc";
      AppMethodBeat.o(21219);
    }
    while (true)
    {
      return str;
      str = b.mNs + " desc, _id desc";
      AppMethodBeat.o(21219);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.model.a
 * JD-Core Version:    0.6.2
 */