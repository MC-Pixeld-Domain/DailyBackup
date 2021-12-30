__command() ->
(
  print('Health Check:');
  print(floor(system_info('java_used_memory')/1000000)+'/'+floor(system_info('java_max_memory')/1000000)+ 'MB Memory Used');
  last_tick = system_info('server_last_tick_times'):0;
  print(floor(last_tick)+' MSPT -> potential tps: '+floor(1000/last_tick));
  print('-- Fabs Health Check erfolgreich');
 );

__config() -> {
    'stay_loaded' -> 'true'
};
