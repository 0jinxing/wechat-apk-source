package com.tencent.mm.pluginsdk.ui.chat;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Images.Thumbnails;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

final class h
{
  private ContentResolver ghb;
  protected Context mContext;

  protected h(Context paramContext)
  {
    AppMethodBeat.i(27948);
    this.mContext = paramContext;
    this.ghb = this.mContext.getContentResolver();
    AppMethodBeat.o(27948);
  }

  private String ajJ(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(27949);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.RecentPhotoTips.ImageQuery", "null or nill imageId");
      AppMethodBeat.o(27949);
      paramString = localObject1;
    }
    Object localObject2;
    while (true)
    {
      return paramString;
      localObject2 = "image_id=\"" + paramString + "\"";
      try
      {
        localObject2 = this.ghb.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, null, (String)localObject2, null, null);
        if (localObject2 != null)
          break;
        ab.e("MicroMsg.RecentPhotoTips.ImageQuery", "get cursor null:".concat(String.valueOf(paramString)));
        AppMethodBeat.o(27949);
        paramString = localObject1;
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.RecentPhotoTips.ImageQuery", "query thumb exception e : %s", new Object[] { paramString.toString() });
        AppMethodBeat.o(27949);
        paramString = localObject1;
      }
    }
    if (((Cursor)localObject2).moveToFirst())
      do
        paramString = ((Cursor)localObject2).getString(((Cursor)localObject2).getColumnIndexOrThrow("_data"));
      while (((Cursor)localObject2).moveToNext());
    while (true)
    {
      ((Cursor)localObject2).close();
      AppMethodBeat.o(27949);
      break;
      paramString = null;
    }
  }

  public final ArrayList<g> dkI()
  {
    AppMethodBeat.i(27950);
    ArrayList localArrayList = new ArrayList();
    bo.anU();
    Cursor localCursor;
    Object localObject;
    try
    {
      localCursor = this.ghb.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[] { "_id", "_data", "date_added" }, null, null, "date_added desc limit 1");
      if (localCursor == null)
      {
        AppMethodBeat.o(27950);
        return localArrayList;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.RecentPhotoTips.ImageQuery", "query photo exception e : %s", new Object[] { localException.toString() });
        AppMethodBeat.o(27950);
        localObject = null;
      }
    }
    if (localCursor.moveToFirst());
    label341: 
    while (true)
    {
      String str1 = localCursor.getString(localCursor.getColumnIndexOrThrow("_id"));
      String str2 = localCursor.getString(localCursor.getColumnIndexOrThrow("_data"));
      String str3 = localCursor.getString(localCursor.getColumnIndexOrThrow("date_added"));
      String str4 = ajJ(str1);
      if ((bo.isNullOrNil(str2)) || (!com.tencent.mm.a.e.ct(str2)))
        ab.e("MicroMsg.RecentPhotoTips.ImageQuery", "file not exist");
      while (true)
      {
        if (localCursor.moveToNext())
          break label341;
        localCursor.close();
        AppMethodBeat.o(27950);
        break;
        if (str2.startsWith(com.tencent.mm.compatible.util.e.euR))
        {
          ab.i("MicroMsg.RecentPhotoTips.ImageQuery", "exclude weixin path image");
        }
        else
        {
          g localg = new g();
          localg.voo = bo.getLong(str1, 0L);
          localg.voq = bo.getLong(str3, 0L);
          if ((!bo.isNullOrNil(str4)) && (com.tencent.mm.a.e.ct(str4)))
            localg.thumbPath = str4;
          if ((!bo.isNullOrNil(str2)) && (com.tencent.mm.a.e.ct(str2)))
            localg.vop = str2;
          if ((bo.isNullOrNil(localg.vop)) && (bo.isNullOrNil(localg.vop)))
            ab.e("MicroMsg.RecentPhotoTips.ImageQuery", "thumb file and orignal file both not exist");
          else
            localObject.add(localg);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.h
 * JD-Core Version:    0.6.2
 */