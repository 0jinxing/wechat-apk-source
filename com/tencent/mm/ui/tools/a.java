package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.format.DateFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.base.h;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class a
{
  public static void a(Activity paramActivity, Intent paramIntent1, Intent paramIntent2, String paramString, int paramInt)
  {
    AppMethodBeat.i(107596);
    b(paramActivity, paramIntent1, paramIntent2, paramString, paramInt, null);
    AppMethodBeat.o(107596);
  }

  public static void b(Activity paramActivity, Intent paramIntent1, Intent paramIntent2, String paramString, int paramInt, a.a parama)
  {
    AppMethodBeat.i(107597);
    boolean bool;
    if ((paramIntent1 == null) || (paramIntent1.getData() == null))
      if (paramIntent1 == null)
      {
        bool = true;
        ab.e("MicroMsg.AsyncObtainImage", "param error, %b", new Object[] { Boolean.valueOf(bool) });
        AppMethodBeat.o(107597);
      }
    while (true)
    {
      return;
      bool = false;
      break;
      if (!paramIntent1.getData().toString().startsWith("content://com.google.android.gallery3d"))
      {
        paramIntent1 = i(paramActivity, paramIntent1, paramString);
        ab.i("MicroMsg.AsyncObtainImage", "resolvePhotoFromIntent, filePath:%s", new Object[] { paramIntent1 });
        if (!bo.isNullOrNil(paramIntent1))
        {
          if (parama != null)
            paramIntent2.putExtra("CropImage_OutputPath", parama.ZB(paramIntent1));
          paramIntent2.putExtra("CropImage_ImgPath", paramIntent1);
          paramActivity.startActivityForResult(paramIntent2, paramInt);
        }
        AppMethodBeat.o(107597);
      }
      else
      {
        new a.2(paramIntent1, paramActivity, paramString, parama, paramIntent2, paramInt).execute(new Integer[] { Integer.valueOf(0) });
        AppMethodBeat.o(107597);
      }
    }
  }

  public static String i(Context paramContext, Intent paramIntent, String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    AppMethodBeat.i(107598);
    if ((paramContext == null) || (paramIntent == null) || (paramString == null))
    {
      ab.e("MicroMsg.AsyncObtainImage", "resolvePhotoFromIntent fail, invalid argument");
      AppMethodBeat.o(107598);
      paramContext = localObject3;
      return paramContext;
    }
    Uri localUri = Uri.parse(paramIntent.toURI());
    Cursor localCursor = paramContext.getContentResolver().query(localUri, null, null, null, null);
    if ((localCursor != null) && (localCursor.getCount() > 0))
    {
      ab.i("MicroMsg.AsyncObtainImage", "resolve photo from cursor");
      paramContext = localObject1;
    }
    label401: label404: 
    while (true)
    {
      try
      {
        if (localUri.toString().startsWith("content://com.google.android.gallery3d"))
        {
          paramContext = localObject1;
          paramIntent = v(paramString, d.u(paramIntent.getData()));
          paramContext = paramIntent;
          label119: if (localCursor != null)
            localCursor.close();
          AppMethodBeat.o(107598);
          break;
        }
        paramContext = localObject1;
        localCursor.moveToFirst();
        paramContext = localObject1;
        paramIntent = localCursor.getString(localCursor.getColumnIndex("_data"));
        paramContext = paramIntent;
        ab.i("MicroMsg.AsyncObtainImage", "photo from resolver, path:".concat(String.valueOf(paramIntent)));
        paramContext = paramIntent;
        continue;
      }
      catch (Exception paramIntent)
      {
        ab.printErrStackTrace("MicroMsg.AsyncObtainImage", paramIntent, "resolve photo error.", new Object[0]);
        continue;
      }
      if (paramIntent.getData() != null)
      {
        paramString = paramIntent.getData().getPath();
        paramContext = paramString;
        if (!bo.isNullOrNil(paramString))
        {
          paramContext = paramString;
          if (!new File(paramString).exists())
            paramContext = null;
        }
        ab.i("MicroMsg.AsyncObtainImage", "photo file from data, path:".concat(String.valueOf(paramContext)));
        if (!bo.isNullOrNil(paramContext))
          break label404;
        paramContext = paramIntent.getData().getHost();
        if ((bo.isNullOrNil(paramContext)) || (new File(paramContext).exists()))
          break label401;
        paramContext = localObject2;
      }
      while (true)
      {
        ab.i("MicroMsg.AsyncObtainImage", "photo file from data, host:".concat(String.valueOf(paramContext)));
        break label119;
        if ((paramIntent.getAction() != null) && (paramIntent.getAction().equals("inline-data")))
        {
          paramContext = v(paramString, (Bitmap)paramIntent.getExtras().get("data"));
          ab.i("MicroMsg.AsyncObtainImage", "resolve photo from action-inline-data:%s", new Object[] { paramContext });
          break label119;
        }
        if (localCursor != null)
          localCursor.close();
        ab.e("MicroMsg.AsyncObtainImage", "resolve photo from intent failed");
        AppMethodBeat.o(107598);
        paramContext = localObject3;
        break;
      }
    }
  }

  public static String v(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(107599);
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      Object localObject2 = g.x(DateFormat.format("yyyy-MM-dd-HH-mm-ss", System.currentTimeMillis()).toString().getBytes()) + ".jpg";
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      paramString = paramString + (String)localObject2;
      localObject2 = new java/io/File;
      ((File)localObject2).<init>(paramString);
      if (!((File)localObject2).exists())
        ((File)localObject2).createNewFile();
      localObject1 = new java/io/BufferedOutputStream;
      FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
      localFileOutputStream.<init>((File)localObject2);
      ((BufferedOutputStream)localObject1).<init>(localFileOutputStream);
      paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject1);
      ((BufferedOutputStream)localObject1).close();
      ab.i("MicroMsg.AsyncObtainImage", "photo image from data, path:".concat(String.valueOf(paramString)));
      AppMethodBeat.o(107599);
      return paramString;
    }
    catch (IOException paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AsyncObtainImage", paramString, "saveBmp Error.", new Object[0]);
        paramString = null;
        AppMethodBeat.o(107599);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a
 * JD-Core Version:    0.6.2
 */