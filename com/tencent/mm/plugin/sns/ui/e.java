package com.tencent.mm.plugin.sns.ui;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public final class e
{
  public static byte[] bj(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(38080);
    Bitmap localBitmap = BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length);
    paramArrayOfByte = localBitmap.copy(Bitmap.Config.ARGB_8888, true);
    Object localObject = new Canvas(paramArrayOfByte);
    ((Canvas)localObject).drawColor(-1);
    ((Canvas)localObject).drawBitmap(localBitmap, 0.0F, 0.0F, null);
    localObject = new ByteArrayOutputStream();
    paramArrayOfByte.compress(Bitmap.CompressFormat.JPEG, 100, (OutputStream)localObject);
    paramArrayOfByte = ((ByteArrayOutputStream)localObject).toByteArray();
    AppMethodBeat.o(38080);
    return paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.e
 * JD-Core Version:    0.6.2
 */