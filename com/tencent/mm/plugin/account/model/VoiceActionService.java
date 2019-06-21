package com.tencent.mm.plugin.account.model;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.DataUsageFeedback;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.a.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class VoiceActionService extends SearchActionVerificationClientService
{
  public final boolean a(Intent paramIntent, boolean paramBoolean)
  {
    AppMethodBeat.i(124711);
    if (!paramBoolean)
    {
      ab.i("MicroMsg.VoiceActionService", "Action is not verified");
      AppMethodBeat.o(124711);
      paramBoolean = false;
      return paramBoolean;
    }
    Object localObject1 = paramIntent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID");
    Object localObject2 = paramIntent.getStringExtra("android.intent.extra.TEXT");
    Object localObject3 = com.tencent.mm.a.g.x(com.tencent.mm.pluginsdk.a.ws((String)localObject1).getBytes());
    localObject3 = com.tencent.mm.plugin.account.a.getAddrUploadStg().vW((String)localObject3).getUsername();
    com.tencent.mm.plugin.messenger.a.g.bOk().F((String)localObject3, (String)localObject2, t.nK((String)localObject3));
    label324: label362: label370: 
    while (true)
    {
      try
      {
        localObject2 = paramIntent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_URI");
        paramIntent = ((String)localObject2).split("/");
        if ((paramIntent != null) && (paramIntent.length > 0))
        {
          paramIntent = paramIntent[(paramIntent.length - 1)];
          if (!bo.isNullOrNil(paramIntent))
            continue;
          ab.e("MicroMsg.VoiceActionService", "extract contact Id error, %s %s", new Object[] { localObject2, localObject1 });
          AppMethodBeat.o(124711);
          paramBoolean = true;
          break;
        }
        paramIntent = "";
        continue;
        if (!com.tencent.mm.pluginsdk.permission.b.o(this, "android.permission.READ_CONTACTS"))
        {
          ab.e("MicroMsg.VoiceActionService", "no contacts permission");
          continue;
        }
      }
      catch (Exception paramIntent)
      {
        ab.printErrStackTrace("MicroMsg.VoiceActionService", paramIntent, "updateContactMarked error", new Object[0]);
        continue;
        localObject3 = getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[] { "_id" }, "contact_id=? AND data1=? AND account_type=? AND mimetype=?", new String[] { paramIntent, localObject1, "com.tencent.mm.account", "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voiceaction" }, null);
        if (localObject3 == null)
          break label362;
      }
      if (((Cursor)localObject3).getCount() > 0)
      {
        ((Cursor)localObject3).moveToNext();
        long l = ((Cursor)localObject3).getLong(0);
        localObject2 = ContactsContract.DataUsageFeedback.FEEDBACK_URI.buildUpon().appendPath(String.valueOf(l)).appendQueryParameter("type", "short_text").build();
        paramIntent = getContentResolver();
        localObject1 = new android/content/ContentValues;
        ((ContentValues)localObject1).<init>();
        if (paramIntent.update((Uri)localObject2, (ContentValues)localObject1, null, null) > 0)
        {
          paramBoolean = true;
          ab.i("MicroMsg.VoiceActionService", "updateContactMarked: %b", new Object[] { Boolean.valueOf(paramBoolean) });
        }
      }
      while (true)
      {
        if (localObject3 == null)
          break label370;
        ((Cursor)localObject3).close();
        break;
        paramBoolean = false;
        break label324;
        ab.i("MicroMsg.VoiceActionService", "updateContactMarked: false");
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.model.VoiceActionService
 * JD-Core Version:    0.6.2
 */