package com.bumptech.glide.c.c;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.c.a;
import com.bumptech.glide.c.a.d;
import com.bumptech.glide.c.a.d.a;
import com.bumptech.glide.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileNotFoundException;

final class k$b
  implements d<File>
{
  private static final String[] aEl = { "_data" };
  private final Context context;
  private final Uri uri;

  k$b(Context paramContext, Uri paramUri)
  {
    this.context = paramContext;
    this.uri = paramUri;
  }

  public final void a(g paramg, d.a<? super File> parama)
  {
    paramg = null;
    Object localObject = null;
    AppMethodBeat.i(92087);
    Cursor localCursor = this.context.getContentResolver().query(this.uri, aEl, null, null, null);
    if (localCursor != null)
      paramg = localObject;
    while (true)
    {
      try
      {
        if (localCursor.moveToFirst())
          paramg = localCursor.getString(localCursor.getColumnIndexOrThrow("_data"));
        localCursor.close();
        if (TextUtils.isEmpty(paramg))
        {
          parama.b(new FileNotFoundException("Failed to find file path for: " + this.uri));
          AppMethodBeat.o(92087);
          return;
        }
      }
      finally
      {
        localCursor.close();
        AppMethodBeat.o(92087);
      }
      parama.S(new File(paramg));
      AppMethodBeat.o(92087);
    }
  }

  public final void cancel()
  {
  }

  public final void cleanup()
  {
  }

  public final Class<File> mg()
  {
    return File.class;
  }

  public final a mh()
  {
    return a.ayD;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.k.b
 * JD-Core Version:    0.6.2
 */