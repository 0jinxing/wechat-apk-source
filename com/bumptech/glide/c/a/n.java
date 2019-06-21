package com.bumptech.glide.c.a;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;

public final class n extends l<InputStream>
{
  private static final UriMatcher azz;

  static
  {
    AppMethodBeat.i(91733);
    UriMatcher localUriMatcher = new UriMatcher(-1);
    azz = localUriMatcher;
    localUriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
    azz.addURI("com.android.contacts", "contacts/lookup/*", 1);
    azz.addURI("com.android.contacts", "contacts/#/photo", 2);
    azz.addURI("com.android.contacts", "contacts/#", 3);
    azz.addURI("com.android.contacts", "contacts/#/display_photo", 4);
    azz.addURI("com.android.contacts", "phone_lookup/*", 5);
    AppMethodBeat.o(91733);
  }

  public n(ContentResolver paramContentResolver, Uri paramUri)
  {
    super(paramContentResolver, paramUri);
  }

  public final Class<InputStream> mg()
  {
    return InputStream.class;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.a.n
 * JD-Core Version:    0.6.2
 */