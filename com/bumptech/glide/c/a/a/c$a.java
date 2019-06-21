package com.bumptech.glide.c.a.a;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Thumbnails;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c$a
  implements d
{
  private static final String[] azD = { "_data" };
  private final ContentResolver azy;

  public c$a(ContentResolver paramContentResolver)
  {
    this.azy = paramContentResolver;
  }

  public final Cursor h(Uri paramUri)
  {
    AppMethodBeat.i(91736);
    paramUri = paramUri.getLastPathSegment();
    paramUri = this.azy.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, azD, "kind = 1 AND image_id = ?", new String[] { paramUri }, null);
    AppMethodBeat.o(91736);
    return paramUri;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.a.a.c.a
 * JD-Core Version:    0.6.2
 */