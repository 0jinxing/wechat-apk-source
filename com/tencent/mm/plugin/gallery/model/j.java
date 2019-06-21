package com.tencent.mm.plugin.gallery.model;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore.Images.Media;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class j extends b
{
  protected ContentResolver bpL;
  private volatile boolean eVT;

  public j()
  {
    AppMethodBeat.i(21303);
    this.eVT = false;
    this.bpL = ah.getContext().getContentResolver();
    AppMethodBeat.o(21303);
  }

  private boolean a(i.d paramd, LinkedList paramLinkedList, long paramLong)
  {
    AppMethodBeat.i(21310);
    if ((paramd != null) && (paramLinkedList.size() + 1 % this.mNq == 0))
      paramd.c(paramLinkedList, paramLong);
    boolean bool = this.eVT;
    AppMethodBeat.o(21310);
    return bool;
  }

  public final String a(String[] paramArrayOfString, boolean paramBoolean)
  {
    AppMethodBeat.i(21305);
    String str1;
    int i;
    int j;
    String str2;
    if (paramBoolean)
    {
      str1 = "(" + b.mNs + ">2147483647 OR " + b.mNs + "<=0 ) AND (_size>10240";
      i = paramArrayOfString.length;
      for (j = 0; j < i; j++)
      {
        str2 = paramArrayOfString[j];
        str1 = str1 + " or lower(_data) like '%" + str2 + "%'";
      }
    }
    for (paramArrayOfString = str1 + ")"; ; paramArrayOfString = str1 + ")")
    {
      ab.d("MicroMsg.ImageMediaQuery", "where %s", new Object[] { paramArrayOfString });
      AppMethodBeat.o(21305);
      return paramArrayOfString;
      str1 = b.mNs + "<=2147483647 AND " + b.mNs + ">0 AND (_size>10240";
      i = paramArrayOfString.length;
      for (j = 0; j < i; j++)
      {
        str2 = paramArrayOfString[j];
        str1 = str1 + " or lower(_data) like '%" + str2 + "%'";
      }
    }
  }

  public final LinkedList<GalleryItem.MediaItem> a(String paramString, int paramInt, i.d paramd, long paramLong)
  {
    AppMethodBeat.i(21309);
    this.eVT = false;
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor1;
    Cursor localCursor2;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (bo.isNullOrNil(paramString))
    {
      localCursor1 = this.bpL.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, getProjection(), a(this.mNr, false), null, hB(false));
      localCursor2 = this.bpL.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, getProjection(), a(this.mNr, true), null, hB(true));
      if (localCursor1 != null)
        localCursor1.moveToFirst();
      if (localCursor2 != null)
        localCursor2.moveToFirst();
      localObject1 = b(localCursor1, 1);
      localObject2 = b(localCursor2, 1);
      localObject3 = null;
      label134: if ((localObject2 == null) || (localObject1 == null))
        break label637;
      if (((GalleryItem.MediaItem)localObject2).mOl <= ((GalleryItem.MediaItem)localObject1).mOl)
        break label288;
      localLinkedList.add(localObject2);
      localCursor2.moveToNext();
      localObject3 = localObject1;
    }
    while (true)
    {
      if (localObject3 == localObject2)
        localObject1 = b(localCursor1, 1);
      if (localObject3 == localObject1)
        localObject2 = b(localCursor2, 1);
      if (!a(paramd, localLinkedList, paramLong))
        break label134;
      AppMethodBeat.o(21309);
      return localLinkedList;
      localCursor1 = this.bpL.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, getProjection(), aP(paramString, false), null, hB(false));
      localCursor2 = this.bpL.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, getProjection(), aP(paramString, true), null, hB(true));
      break;
      label288: if (((GalleryItem.MediaItem)localObject2).mOl < ((GalleryItem.MediaItem)localObject1).mOl)
      {
        localLinkedList.add(localObject1);
        localCursor1.moveToNext();
        localObject3 = localObject2;
      }
      else
      {
        localLinkedList.add(localObject1);
        localLinkedList.add(localObject2);
        localObject3 = null;
        localCursor2.moveToNext();
        localCursor1.moveToNext();
      }
    }
    while (true)
    {
      label363: if (localObject4 != null)
      {
        if ((localObject2 != null) && (((GalleryItem.MediaItem)localObject2).mOl > ((GalleryItem.MediaItem)localObject4).mOl))
        {
          localLinkedList.add(localObject2);
          localLinkedList.add(localObject4);
          localObject2 = null;
        }
        while (true)
        {
          localCursor2.moveToNext();
          localObject4 = b(localCursor2, 1);
          if (!a(paramd, localLinkedList, paramLong))
            break label363;
          AppMethodBeat.o(21309);
          break;
          localLinkedList.add(localObject4);
        }
        localObject3 = localObject1;
      }
      while (true)
      {
        label454: if (localObject2 != null)
        {
          if ((localObject3 != null) && (localObject3.mOl > ((GalleryItem.MediaItem)localObject2).mOl))
          {
            localLinkedList.add(localObject3);
            localLinkedList.add(localObject2);
          }
          for (localObject1 = null; ; localObject1 = localObject3)
          {
            localCursor1.moveToNext();
            localObject2 = b(localCursor1, 1);
            if (!a(paramd, localLinkedList, paramLong))
              break label454;
            AppMethodBeat.o(21309);
            break;
            localLinkedList.add(localObject2);
          }
        }
        if (localObject3 != null)
          localLinkedList.add(localObject3);
        paramd.c(localLinkedList, paramLong);
        ab.i("MicroMsg.ImageMediaQuery", "[queryMediaItemsInAlbum] albumName:%s type:%s result:%s ticket:%s", new Object[] { paramString, Integer.valueOf(paramInt), Integer.valueOf(localLinkedList.size()), Long.valueOf(paramLong) });
        AppMethodBeat.o(21309);
        break;
        localObject3 = localObject2;
        localObject2 = localObject1;
      }
      label637: Object localObject4 = localObject2;
      localObject2 = localObject3;
    }
  }

  public final String aP(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(21304);
    StringBuilder localStringBuilder = new StringBuilder("bucket_display_name=\"").append(paramString).append("\" AND ");
    if (paramBoolean);
    for (paramString = "(" + b.mNs + ">2147483647 OR " + b.mNs + "<=0 )"; ; paramString = b.mNs + "<=2147483647 AND " + b.mNs + ">0")
    {
      paramString = paramString;
      AppMethodBeat.o(21304);
      return paramString;
    }
  }

  public final LinkedList<GalleryItem.AlbumItem> bBS()
  {
    AppMethodBeat.i(21308);
    LinkedList localLinkedList = new LinkedList();
    Object localObject1;
    try
    {
      Cursor localCursor = this.bpL.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, bBU(), "0==0) GROUP BY (bucket_display_name", null, "max_time desc, _id desc");
      if (localCursor == null)
      {
        ab.d("MicroMsg.ImageMediaQuery", "no media folder now");
        AppMethodBeat.o(21308);
        return localLinkedList;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.ImageMediaQuery", "query album list failed : [%s]", new Object[] { localException.getMessage() });
        localObject1 = null;
      }
    }
    if (localObject1.moveToFirst());
    label321: 
    while (true)
    {
      long l = bo.anl(localObject1.getString(localObject1.getColumnIndexOrThrow("_id")));
      Object localObject2 = localObject1.getString(localObject1.getColumnIndexOrThrow("_data"));
      Object localObject3 = localObject1.getString(localObject1.getColumnIndexOrThrow("bucket_display_name"));
      bo.isNullOrNil((String)localObject3);
      int i;
      if ((!bo.isNullOrNil((String)localObject2)) && (e.ct((String)localObject2)))
      {
        i = localObject1.getInt(3);
        if (i != 0)
          break label228;
        ab.e("MicroMsg.ImageMediaQuery", "query album failed, " + i + ", " + (String)localObject2);
      }
      while (true)
      {
        if (localObject1.moveToNext())
          break label321;
        localObject1.close();
        AppMethodBeat.o(21308);
        break;
        label228: ab.i("MicroMsg.ImageMediaQuery", "%s(%s) path:%s", new Object[] { localObject3, Integer.valueOf(i), localObject2 });
        String str = localObject1.getString(localObject1.getColumnIndexOrThrow("mime_type"));
        localObject2 = GalleryItem.MediaItem.a(1, Long.valueOf(l).longValue(), (String)localObject2, null, str);
        localObject3 = new GalleryItem.AlbumItem((String)localObject3, i);
        ((GalleryItem.AlbumItem)localObject3).mOh = ((GalleryItem.MediaItem)localObject2);
        localLinkedList.add(localObject3);
      }
    }
  }

  public final void bBT()
  {
    this.eVT = true;
  }

  public final String[] bBU()
  {
    AppMethodBeat.i(21307);
    String str1 = b.mNt;
    String str2 = b.mNs;
    String str3 = "max(" + b.mNs + ") as max_time";
    AppMethodBeat.o(21307);
    return new String[] { "_id", "_data", "bucket_display_name", "count(*)", str1, str2, "mime_type", str3 };
  }

  public final String[] getProjection()
  {
    return new String[] { "_id", "_data", b.mNt, b.mNs, "mime_type", "latitude", "longitude" };
  }

  public final String hB(boolean paramBoolean)
  {
    AppMethodBeat.i(21306);
    String str;
    if (paramBoolean)
    {
      str = b.mNt + " desc, _id desc";
      AppMethodBeat.o(21306);
    }
    while (true)
    {
      return str;
      str = b.mNs + " desc, _id desc";
      AppMethodBeat.o(21306);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.model.j
 * JD-Core Version:    0.6.2
 */