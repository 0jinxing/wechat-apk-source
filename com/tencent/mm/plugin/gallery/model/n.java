package com.tencent.mm.plugin.gallery.model;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore.Video.Media;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class n extends b
{
  protected ContentResolver bpL;
  private volatile boolean eVT;

  public n()
  {
    AppMethodBeat.i(21333);
    this.eVT = false;
    this.bpL = ah.getContext().getContentResolver();
    AppMethodBeat.o(21333);
  }

  private boolean a(i.d paramd, LinkedList paramLinkedList, long paramLong)
  {
    AppMethodBeat.i(21340);
    if ((paramd != null) && (paramLinkedList.size() + 1 % this.mNq == 0))
      paramd.c(paramLinkedList, paramLong);
    boolean bool = this.eVT;
    AppMethodBeat.o(21340);
    return bool;
  }

  public final String a(String[] paramArrayOfString, boolean paramBoolean)
  {
    AppMethodBeat.i(21335);
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
      AppMethodBeat.o(21335);
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
    AppMethodBeat.i(21339);
    this.eVT = false;
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor1;
    Cursor localCursor2;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (bo.isNullOrNil(paramString))
    {
      localCursor1 = this.bpL.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, getProjection(), a(new String[] { this.mNr[0] }, false), null, hB(false));
      localCursor2 = this.bpL.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, getProjection(), a(new String[] { this.mNr[0] }, true), null, hB(true));
      if (localCursor1 != null)
        localCursor1.moveToFirst();
      if (localCursor2 != null)
        localCursor2.moveToFirst();
      localObject1 = b(localCursor1, 2);
      localObject2 = b(localCursor2, 2);
      localObject3 = null;
      label152: if ((localObject2 == null) || (localObject1 == null))
        break label651;
      if (((GalleryItem.MediaItem)localObject2).mOl <= ((GalleryItem.MediaItem)localObject1).mOl)
        break label306;
      localLinkedList.add(localObject2);
      localCursor2.moveToNext();
      localObject3 = localObject1;
    }
    while (true)
    {
      if (localObject3 == localObject2)
        localObject1 = b(localCursor1, 2);
      if (localObject3 == localObject1)
        localObject2 = b(localCursor2, 2);
      if (!a(paramd, localLinkedList, paramLong))
        break label152;
      AppMethodBeat.o(21339);
      return localLinkedList;
      localCursor1 = this.bpL.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, getProjection(), aP(paramString, false), null, hB(false));
      localCursor2 = this.bpL.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, getProjection(), aP(paramString, true), null, hB(true));
      break;
      label306: if (((GalleryItem.MediaItem)localObject2).mOl < ((GalleryItem.MediaItem)localObject1).mOl)
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
      label381: if (localObject3 != null)
      {
        if ((localObject2 != null) && (((GalleryItem.MediaItem)localObject2).mOl > ((GalleryItem.MediaItem)localObject3).mOl))
        {
          localLinkedList.add(localObject2);
          localLinkedList.add(localObject3);
          localObject2 = null;
        }
        while (true)
        {
          localCursor2.moveToNext();
          localObject3 = b(localCursor2, 2);
          if (!a(paramd, localLinkedList, paramLong))
            break label381;
          AppMethodBeat.o(21339);
          break;
          localLinkedList.add(localObject3);
        }
        localObject2 = localObject1;
      }
      while (true)
      {
        label472: if (localObject3 != null)
        {
          if ((localObject2 != null) && (((GalleryItem.MediaItem)localObject2).mOl > ((GalleryItem.MediaItem)localObject3).mOl))
          {
            localLinkedList.add(localObject2);
            localLinkedList.add(localObject3);
          }
          for (localObject1 = null; ; localObject1 = localObject2)
          {
            localCursor1.moveToNext();
            localObject3 = b(localCursor1, 2);
            if (!a(paramd, localLinkedList, paramLong))
              break label472;
            AppMethodBeat.o(21339);
            break;
            localLinkedList.add(localObject3);
          }
        }
        if (localObject2 != null)
          localLinkedList.add(localObject2);
        paramd.c(localLinkedList, paramLong);
        ab.i("MicroMsg.ImageMediaQuery", "[queryMediaItemsInAlbum] albumName:%s type:%s result:%s ticket:%s", new Object[] { paramString, Integer.valueOf(paramInt), Integer.valueOf(localLinkedList.size()), Long.valueOf(paramLong) });
        AppMethodBeat.o(21339);
        break;
        localObject3 = localObject1;
      }
      label651: Object localObject4 = localObject2;
      localObject2 = localObject3;
      localObject3 = localObject4;
    }
  }

  public final String aP(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(21334);
    StringBuilder localStringBuilder = new StringBuilder("bucket_display_name=\"").append(paramString).append("\" AND ");
    if (paramBoolean);
    for (paramString = "(" + b.mNs + ">2147483647 OR " + b.mNs + "<=0 )"; ; paramString = b.mNs + "<=2147483647 AND " + b.mNs + ">0")
    {
      paramString = paramString;
      AppMethodBeat.o(21334);
      return paramString;
    }
  }

  public final LinkedList<GalleryItem.AlbumItem> bBS()
  {
    AppMethodBeat.i(21338);
    LinkedList localLinkedList = new LinkedList();
    Object localObject1;
    try
    {
      Cursor localCursor = this.bpL.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, bBU(), "0==0) GROUP BY (bucket_display_name", null, "max_time desc, _id desc");
      if (localCursor == null)
      {
        ab.d("MicroMsg.ImageMediaQuery", "no media folder now");
        AppMethodBeat.o(21338);
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
    label334: 
    while (true)
    {
      long l = bo.anl(localObject1.getString(localObject1.getColumnIndexOrThrow("_id")));
      Object localObject2 = localObject1.getString(localObject1.getColumnIndexOrThrow("_data"));
      Object localObject3 = localObject1.getString(localObject1.getColumnIndexOrThrow("bucket_display_name"));
      if (bo.isNullOrNil((String)localObject3))
        ab.e("MicroMsg.ImageMediaQuery", "null or nill album name, ignore this folder");
      while (true)
      {
        if (localObject1.moveToNext())
          break label334;
        localObject1.close();
        AppMethodBeat.o(21338);
        break;
        if ((!bo.isNullOrNil((String)localObject2)) && (e.ct((String)localObject2)))
        {
          int i = localObject1.getInt(3);
          if (i == 0)
          {
            ab.e("MicroMsg.ImageMediaQuery", "query album failed, " + i + ", " + (String)localObject2);
          }
          else
          {
            ab.i("MicroMsg.ImageMediaQuery", "%s(%s) path:%s", new Object[] { localObject3, Integer.valueOf(i), localObject2 });
            String str = localObject1.getString(localObject1.getColumnIndexOrThrow("mime_type"));
            localObject2 = GalleryItem.MediaItem.a(2, Long.valueOf(l).longValue(), (String)localObject2, null, str);
            localObject3 = new GalleryItem.AlbumItem((String)localObject3, i);
            ((GalleryItem.AlbumItem)localObject3).mOh = ((GalleryItem.MediaItem)localObject2);
            localLinkedList.add(localObject3);
          }
        }
      }
    }
  }

  public final void bBT()
  {
    this.eVT = true;
  }

  public final String[] bBU()
  {
    AppMethodBeat.i(21337);
    String str1 = b.mNt;
    String str2 = b.mNs;
    String str3 = "max(" + b.mNs + ") as max_time";
    AppMethodBeat.o(21337);
    return new String[] { "_id", "_data", "bucket_display_name", "count(*)", str1, str2, "mime_type", str3 };
  }

  public final String[] getProjection()
  {
    return new String[] { "_id", "_data", b.mNt, b.mNs, "mime_type", "latitude", "longitude" };
  }

  public final String hB(boolean paramBoolean)
  {
    AppMethodBeat.i(21336);
    String str;
    if (paramBoolean)
    {
      str = b.mNt + " desc, _id desc";
      AppMethodBeat.o(21336);
    }
    while (true)
    {
      return str;
      str = b.mNs + " desc, _id desc";
      AppMethodBeat.o(21336);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.model.n
 * JD-Core Version:    0.6.2
 */