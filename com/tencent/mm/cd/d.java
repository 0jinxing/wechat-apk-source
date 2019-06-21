package com.tencent.mm.cd;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.a.a;
import com.tencent.mm.cd.a.f.a;
import java.util.HashMap;

public final class d
  implements Cursor, com.tencent.mm.cd.a.d
{
  private static Cursor ybs;

  public static Cursor dvo()
  {
    AppMethodBeat.i(59037);
    if (ybs == null)
      ybs = new d();
    Cursor localCursor = ybs;
    AppMethodBeat.o(59037);
    return localCursor;
  }

  public final boolean MF(int paramInt)
  {
    return false;
  }

  public final a MG(int paramInt)
  {
    return null;
  }

  public final void MH(int paramInt)
  {
  }

  public final void a(f.a parama)
  {
  }

  public final boolean a(Object paramObject, a parama)
  {
    return false;
  }

  public final boolean cK(Object paramObject)
  {
    return false;
  }

  public final a cL(Object paramObject)
  {
    return null;
  }

  public final void close()
  {
  }

  public final void copyStringToBuffer(int paramInt, CharArrayBuffer paramCharArrayBuffer)
  {
  }

  public final void deactivate()
  {
  }

  public final SparseArray[] dvp()
  {
    return null;
  }

  public final HashMap dvq()
  {
    return null;
  }

  public final boolean dvr()
  {
    return false;
  }

  public final byte[] getBlob(int paramInt)
  {
    return null;
  }

  public final int getColumnCount()
  {
    return 0;
  }

  public final int getColumnIndex(String paramString)
  {
    return 0;
  }

  public final int getColumnIndexOrThrow(String paramString)
  {
    return 0;
  }

  public final String getColumnName(int paramInt)
  {
    return null;
  }

  public final String[] getColumnNames()
  {
    return null;
  }

  public final int getCount()
  {
    return 0;
  }

  public final double getDouble(int paramInt)
  {
    return 0.0D;
  }

  public final Bundle getExtras()
  {
    return null;
  }

  public final float getFloat(int paramInt)
  {
    return 0.0F;
  }

  public final int getInt(int paramInt)
  {
    return 0;
  }

  public final long getLong(int paramInt)
  {
    return 0L;
  }

  public final Uri getNotificationUri()
  {
    return null;
  }

  public final int getPosition()
  {
    return 0;
  }

  public final short getShort(int paramInt)
  {
    return 0;
  }

  public final String getString(int paramInt)
  {
    return null;
  }

  public final int getType(int paramInt)
  {
    return 0;
  }

  public final boolean getWantsAllOnMoveCalls()
  {
    return false;
  }

  public final boolean isAfterLast()
  {
    return true;
  }

  public final boolean isBeforeFirst()
  {
    return false;
  }

  public final boolean isClosed()
  {
    return false;
  }

  public final boolean isFirst()
  {
    return false;
  }

  public final boolean isLast()
  {
    return false;
  }

  public final boolean isNull(int paramInt)
  {
    return false;
  }

  public final boolean move(int paramInt)
  {
    return false;
  }

  public final boolean moveToFirst()
  {
    return false;
  }

  public final boolean moveToLast()
  {
    return false;
  }

  public final boolean moveToNext()
  {
    return false;
  }

  public final boolean moveToPosition(int paramInt)
  {
    return false;
  }

  public final boolean moveToPrevious()
  {
    return false;
  }

  public final void pt(boolean paramBoolean)
  {
  }

  public final void registerContentObserver(ContentObserver paramContentObserver)
  {
  }

  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
  }

  public final boolean requery()
  {
    return false;
  }

  public final Bundle respond(Bundle paramBundle)
  {
    return null;
  }

  public final void setExtras(Bundle paramBundle)
  {
  }

  public final void setNotificationUri(ContentResolver paramContentResolver, Uri paramUri)
  {
  }

  public final void unregisterContentObserver(ContentObserver paramContentObserver)
  {
  }

  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cd.d
 * JD-Core Version:    0.6.2
 */