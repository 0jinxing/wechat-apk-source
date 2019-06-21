package com.bumptech.glide.c.a.a;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Video.Thumbnails;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c$b
  implements d
{
  private static final String[] azD = { "_data" };
  private final ContentResolver azy;

  public c$b(ContentResolver paramContentResolver)
  {
    this.azy = paramContentResolver;
  }

  public final Cursor h(Uri paramUri)
  {
    AppMethodBeat.i(91737);
    paramUri = paramUri.getLastPathSegment();
    paramUri = this.azy.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, azD, "kind = 1 AND video_id = ?", new String[] { paramUri }, null);
    AppMethodBeat.o(91737);
    return paramUri;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.a.a.c.b
 * JD-Core Version:    0.6.2
 */