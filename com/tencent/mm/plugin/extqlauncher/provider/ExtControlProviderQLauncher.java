package com.tencent.mm.plugin.extqlauncher.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.ext.provider.ExtContentProviderBase;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.be;

public class ExtControlProviderQLauncher extends ExtContentProviderBase
{
  private static final String[] lPA;
  private static final UriMatcher lQc;
  private static final String[] lRU;
  private Context context;
  private String[] lPN;
  private int lRV = -1;

  static
  {
    AppMethodBeat.i(20492);
    UriMatcher localUriMatcher = new UriMatcher(-1);
    lQc = localUriMatcher;
    localUriMatcher.addURI("com.tencent.mm.plugin.extqlauncher", "openQRCodeScan", 18);
    lQc.addURI("com.tencent.mm.plugin.extqlauncher", "batchAddShortcut", 19);
    lQc.addURI("com.tencent.mm.plugin.extqlauncher", "getUnreadCount", 20);
    lPA = new String[] { "retCode" };
    lRU = new String[] { "id", "count" };
    AppMethodBeat.o(20492);
  }

  public ExtControlProviderQLauncher()
  {
  }

  public ExtControlProviderQLauncher(String[] paramArrayOfString, int paramInt, Context paramContext)
  {
    this.lPN = paramArrayOfString;
    this.lRV = paramInt;
    this.context = paramContext;
  }

  private Cursor A(String[] paramArrayOfString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(20491);
    ab.d("MicroMsg.ExtControlProviderQLauncher", "getUnreadCount");
    if (this.context == null)
    {
      vf(4);
      AppMethodBeat.o(20491);
      paramArrayOfString = localObject1;
    }
    while (true)
    {
      return paramArrayOfString;
      if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
      {
        ab.e("MicroMsg.ExtControlProviderQLauncher", "wrong args");
        vf(3);
        AppMethodBeat.o(20491);
        paramArrayOfString = localObject1;
      }
      else
      {
        MatrixCursor localMatrixCursor = new MatrixCursor(lRU);
        int i = 0;
        while (true)
        {
          try
          {
            if ((i >= paramArrayOfString.length) || (i >= 10))
              break label288;
            if (!bo.isNullOrNil(paramArrayOfString[i]))
            {
              if (paramArrayOfString[i].equals("0"))
              {
                localObject2 = paramArrayOfString[i];
                com.tencent.mm.plugin.extqlauncher.b.bsa();
                localMatrixCursor.addRow(new Object[] { localObject2, Integer.valueOf(com.tencent.mm.plugin.extqlauncher.b.bsb()) });
              }
            }
            else
            {
              i++;
              continue;
            }
            Object localObject2 = com.tencent.mm.plugin.base.model.b.Fs(paramArrayOfString[i]);
            if (bo.isNullOrNil((String)localObject2))
              continue;
            aw.ZK();
            localObject2 = c.XR().aoZ((String)localObject2);
            if (localObject2 == null)
              break label263;
            localMatrixCursor.addRow(new Object[] { paramArrayOfString[i], Integer.valueOf(((at)localObject2).field_unReadCount) });
            continue;
          }
          catch (Exception paramArrayOfString)
          {
            ab.e("MicroMsg.ExtControlProviderQLauncher", "exception in updateShortcut, %s", new Object[] { paramArrayOfString.getMessage() });
            vf(4);
            localMatrixCursor.close();
            AppMethodBeat.o(20491);
            paramArrayOfString = localObject1;
          }
          break;
          label263: localMatrixCursor.addRow(new Object[] { paramArrayOfString[i], Integer.valueOf(0) });
        }
        label288: vf(0);
        AppMethodBeat.o(20491);
        paramArrayOfString = localMatrixCursor;
      }
    }
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }

  public String getType(Uri paramUri)
  {
    return null;
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }

  public boolean onCreate()
  {
    return true;
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    paramArrayOfString1 = null;
    AppMethodBeat.i(20490);
    ab.d("MicroMsg.ExtControlProviderQLauncher", "query()");
    a(paramUri, this.context, this.lRV, this.lPN);
    if (paramUri == null)
    {
      vf(3);
      AppMethodBeat.o(20490);
      paramUri = paramArrayOfString1;
    }
    while (true)
    {
      return paramUri;
      if ((bo.isNullOrNil(this.lPW)) || (bo.isNullOrNil(brL())))
      {
        vf(3);
        AppMethodBeat.o(20490);
        paramUri = paramArrayOfString1;
      }
      else if (!aVl())
      {
        vf(1);
        paramUri = this.jDN;
        AppMethodBeat.o(20490);
      }
      else if (!dJ(this.context))
      {
        ab.w("MicroMsg.ExtControlProviderQLauncher", "invalid appid ! return null");
        vf(2);
        AppMethodBeat.o(20490);
        paramUri = paramArrayOfString1;
      }
      else
      {
        switch (this.lRV)
        {
        default:
          vf(3);
          AppMethodBeat.o(20490);
          paramUri = paramArrayOfString1;
          break;
        case 18:
          ab.d("MicroMsg.ExtControlProviderQLauncher", "toScanQRCode");
          if (this.context == null)
          {
            vf(4);
            AppMethodBeat.o(20490);
            paramUri = paramArrayOfString1;
          }
          else
          {
            paramUri = new Intent();
            paramUri.putExtra("BaseScanUI_select_scan_mode", 1);
            paramUri.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
            d.b(this.context, "scanner", ".ui.BaseScanUI", paramUri);
            paramUri = new MatrixCursor(lPA);
            paramUri.addRow(new Object[] { Integer.valueOf(1) });
            vf(0);
            AppMethodBeat.o(20490);
          }
          break;
        case 19:
          ab.d("MicroMsg.ExtControlProviderQLauncher", "toCreateShortcut");
          if (this.context == null)
          {
            vf(4);
            AppMethodBeat.o(20490);
            paramUri = paramArrayOfString1;
          }
          else
          {
            paramUri = new Intent();
            d.b(this.context, "extqlauncher", ".ui.QLauncherCreateShortcutUI", paramUri);
            paramUri = new MatrixCursor(lPA);
            paramUri.addRow(new Object[] { Integer.valueOf(1) });
            vf(0);
            AppMethodBeat.o(20490);
          }
          break;
        case 20:
          paramUri = A(paramArrayOfString2);
          AppMethodBeat.o(20490);
        }
      }
    }
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.extqlauncher.provider.ExtControlProviderQLauncher
 * JD-Core Version:    0.6.2
 */