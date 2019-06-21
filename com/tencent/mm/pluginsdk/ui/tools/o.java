package com.tencent.mm.pluginsdk.ui.tools;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;

public final class o
{
  public Context context;
  public String filePath;
  public int fileType;
  public Uri uri;

  public o(Context paramContext, Uri paramUri)
  {
    AppMethodBeat.i(79956);
    this.fileType = 0;
    this.context = paramContext;
    this.uri = paramUri;
    if (paramUri == null)
    {
      ab.e("MicroMsg.UriFileHelper", "initFileTypeAndPath uri == null");
      AppMethodBeat.o(79956);
    }
    Object localObject2;
    while (true)
    {
      return;
      if (this.context == null)
      {
        ab.e("MicroMsg.UriFileHelper", "initFileTypeAndPath context == null");
        AppMethodBeat.o(79956);
      }
      else
      {
        localObject2 = MimeTypeMap.getSingleton();
        paramContext = this.context.getContentResolver().getType(paramUri);
        if ((paramContext != null) && (paramContext.length() > 0))
          break label227;
        if (paramUri.getPath() == null)
          break label246;
        localObject1 = new File(paramUri.getPath());
        if (((File)localObject1).exists())
          break;
        ab.e("MicroMsg.UriFileHelper", "File is null");
        this.fileType = 0;
        AppMethodBeat.o(79956);
      }
    }
    this.filePath = ((File)localObject1).getAbsolutePath();
    int i = this.filePath.lastIndexOf(".");
    if ((i == -1) || (i >= this.filePath.length() - 1))
      this.fileType = 1;
    while (true)
    {
      if ((paramContext != null) && (this.filePath != null))
        break label372;
      this.fileType = 0;
      AppMethodBeat.o(79956);
      break;
      paramContext = ((MimeTypeMap)localObject2).getMimeTypeFromExtension(this.filePath.substring(i + 1));
    }
    label227: if (this.context == null)
      ab.e("MicroMsg.UriFileHelper", "getFilePath context == null");
    while (true)
    {
      this.filePath = ((String)localObject1);
      label246: break;
      localObject2 = this.context.getContentResolver().query(paramUri, null, null, null, null);
      if (localObject2 == null)
      {
        ab.e("MicroMsg.UriFileHelper", "getFilePath : fail, cursor is null");
      }
      else if ((((Cursor)localObject2).getCount() <= 0) || (!((Cursor)localObject2).moveToFirst()))
      {
        ((Cursor)localObject2).close();
        ab.e("MicroMsg.UriFileHelper", "getFilePath : fail, cursor getCount is 0 or moveToFirst fail");
      }
      else
      {
        i = ((Cursor)localObject2).getColumnIndex("_data");
        if (i == -1)
        {
          ((Cursor)localObject2).close();
          ab.e("MicroMsg.UriFileHelper", "getFilePath : columnIdx is -1, column with columnName = _data does not exist");
        }
        else
        {
          localObject1 = ((Cursor)localObject2).getString(i);
          ((Cursor)localObject2).close();
        }
      }
    }
    label372: if (paramContext.contains("image"))
      this.fileType = 3;
    while (true)
    {
      ab.d("MicroMsg.UriFileHelper", "MimeType[%s], filePath = [%s], fileType = [%s], type = [%s], Uri[%s]", new Object[] { paramContext, this.filePath, Integer.valueOf(this.fileType), paramContext, paramUri.toString() });
      AppMethodBeat.o(79956);
      break;
      if (paramContext.contains("video"))
        this.fileType = 4;
      else if (paramContext.contains("audio"))
        this.fileType = 5;
      else if (paramContext.contains("mm_item"))
        this.fileType = 2;
      else
        this.fileType = 1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.o
 * JD-Core Version:    0.6.2
 */