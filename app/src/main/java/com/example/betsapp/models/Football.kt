package com.example.betsapp.models

data class Football(
    val homeTeamImage: String,
    val awayTeamImage: String,
    val leagueTime: String,
    val homeTeam: String,
    val awayTeam: String,
    val tip: String,
    val result: String,
    val outCome: String
){
    constructor():this(
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        ""

    )
}