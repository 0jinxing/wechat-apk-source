package com.facebook.appevents.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.UUID;

class SessionInfo
{
  private static final String INTERRUPTION_COUNT_KEY = "com.facebook.appevents.SessionInfo.interruptionCount";
  private static final String LAST_SESSION_INFO_END_KEY = "com.facebook.appevents.SessionInfo.sessionEndTime";
  private static final String LAST_SESSION_INFO_START_KEY = "com.facebook.appevents.SessionInfo.sessionStartTime";
  private static final String SESSION_ID_KEY = "com.facebook.appevents.SessionInfo.sessionId";
  private Long diskRestoreTime;
  private int interruptionCount;
  private UUID sessionId;
  private Long sessionLastEventTime;
  private Long sessionStartTime;
  private SourceApplicationInfo sourceApplicationInfo;

  public SessionInfo(Long paramLong1, Long paramLong2)
  {
    this(paramLong1, paramLong2, UUID.randomUUID());
    AppMethodBeat.i(72214);
    AppMethodBeat.o(72214);
  }

  public SessionInfo(Long paramLong1, Long paramLong2, UUID paramUUID)
  {
    this.sessionStartTime = paramLong1;
    this.sessionLastEventTime = paramLong2;
    this.sessionId = paramUUID;
  }

  public static void clearSavedSessionFromDisk()
  {
    AppMethodBeat.i(72216);
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
    localEditor.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
    localEditor.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
    localEditor.remove("com.facebook.appevents.SessionInfo.interruptionCount");
    localEditor.remove("com.facebook.appevents.SessionInfo.sessionId");
    localEditor.apply();
    SourceApplicationInfo.clearSavedSourceApplicationInfoFromDisk();
    AppMethodBeat.o(72216);
  }

  public static SessionInfo getStoredSessionInfo()
  {
    SessionInfo localSessionInfo = null;
    AppMethodBeat.i(72215);
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext());
    long l1 = localSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
    long l2 = localSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
    String str = localSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
    if ((l1 == 0L) || (l2 == 0L) || (str == null))
      AppMethodBeat.o(72215);
    while (true)
    {
      return localSessionInfo;
      localSessionInfo = new SessionInfo(Long.valueOf(l1), Long.valueOf(l2));
      localSessionInfo.interruptionCount = localSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
      localSessionInfo.sourceApplicationInfo = SourceApplicationInfo.getStoredSourceApplicatioInfo();
      localSessionInfo.diskRestoreTime = Long.valueOf(System.currentTimeMillis());
      localSessionInfo.sessionId = UUID.fromString(str);
      AppMethodBeat.o(72215);
    }
  }

  public long getDiskRestoreTime()
  {
    AppMethodBeat.i(72217);
    long l;
    if (this.diskRestoreTime == null)
    {
      l = 0L;
      AppMethodBeat.o(72217);
    }
    while (true)
    {
      return l;
      l = this.diskRestoreTime.longValue();
      AppMethodBeat.o(72217);
    }
  }

  public int getInterruptionCount()
  {
    return this.interruptionCount;
  }

  public UUID getSessionId()
  {
    return this.sessionId;
  }

  public Long getSessionLastEventTime()
  {
    return this.sessionLastEventTime;
  }

  public long getSessionLength()
  {
    AppMethodBeat.i(72218);
    long l;
    if ((this.sessionStartTime == null) || (this.sessionLastEventTime == null))
    {
      l = 0L;
      AppMethodBeat.o(72218);
    }
    while (true)
    {
      return l;
      l = this.sessionLastEventTime.longValue() - this.sessionStartTime.longValue();
      AppMethodBeat.o(72218);
    }
  }

  public Long getSessionStartTime()
  {
    return this.sessionStartTime;
  }

  public SourceApplicationInfo getSourceApplicationInfo()
  {
    return this.sourceApplicationInfo;
  }

  public void incrementInterruptionCount()
  {
    this.interruptionCount += 1;
  }

  public void setSessionLastEventTime(Long paramLong)
  {
    this.sessionLastEventTime = paramLong;
  }

  public void setSourceApplicationInfo(SourceApplicationInfo paramSourceApplicationInfo)
  {
    this.sourceApplicationInfo = paramSourceApplicationInfo;
  }

  public void writeSessionToDisk()
  {
    AppMethodBeat.i(72219);
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
    localEditor.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", this.sessionStartTime.longValue());
    localEditor.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", this.sessionLastEventTime.longValue());
    localEditor.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.interruptionCount);
    localEditor.putString("com.facebook.appevents.SessionInfo.sessionId", this.sessionId.toString());
    localEditor.apply();
    if (this.sourceApplicationInfo != null)
      this.sourceApplicationInfo.writeSourceApplicationInfoToDisk();
    AppMethodBeat.o(72219);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.internal.SessionInfo
 * JD-Core Version:    0.6.2
 */